package another.tool.recognition.lenguage.format;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sintatic {
    private final List<Token> tokens;
    private int pos;
    private final List<GrammarRule> rules;

    public Sintatic(Lexer lexer) {
        this.tokens = lexer.tokenize();
        this.pos = 0;
        this.rules = new ArrayList<>();
    }

    public void addGramatic(List<Object> pattern, Consumer<List<String>> action) {
        rules.add(new GrammarRule(pattern, action));
    }

    public void parse() {
        while (pos < tokens.size()) {
            boolean matched = false;
            for (GrammarRule rule : rules) {
                int startPos = pos;
                List<String> values = new ArrayList<>();
                if (match(rule.pattern, values)) {
                    rule.action.accept(values);
                    matched = true;
                    break; // Salir del loop una vez que una regla ha coincidido
                }
                pos = startPos; // Restablecer la posición si no coincide
            }
            if (!matched) {
                throw new RuntimeException("No matching grammar rule found at position: " + pos);
            }
            // Omitir el token de fin de archivo
            if (tokens.get(pos).type == TypeToken.EOF) {
                break;
            }
        }
    }

    private boolean match(List<Object> pattern, List<String> values) {
        int startPos = pos;
        for (Object item : pattern) {
            if (pos >= tokens.size()) {
                pos = startPos;
                return false;
            }
            if (item instanceof Enum<?>) {
                if (tokens.get(pos).type != item) {
                    pos = startPos;
                    return false;
                }
                values.add(tokens.get(pos).value);
                pos++;
            } else if (item instanceof String) {
                if (!tokens.get(pos).value.equals(item)) {
                    pos = startPos;
                    return false;
                }
                values.add(tokens.get(pos).value);
                pos++;
            } else if (item instanceof List) {
                List<String> nestedValues = new ArrayList<>();
                if (!match((List<Object>) item, nestedValues)) {
                    pos = startPos;
                    return false;
                }
                values.addAll(nestedValues);
            } else if (item instanceof GrammarOption) {
                GrammarOption option = (GrammarOption) item;
                boolean optionMatched = false;
                switch (option.type) {
                    case GrammarOption.ALTERNATIVE:
                        for (Object opt : option.options) {
                            List<String> optionValues = new ArrayList<>();
                            if (match(List.of(opt), optionValues)) {
                                values.addAll(optionValues);
                                optionMatched = true;
                                break;
                            }
                        }
                        break;
                    case GrammarOption.OPTIONAL:
                        for (Object opt : option.options) {
                            List<String> optionValues = new ArrayList<>();
                            if (match(List.of(opt), optionValues)) {
                                values.addAll(optionValues);
                                optionMatched = true;
                                break;
                            }
                        }
                        if (!optionMatched) {
                            values.add(""); // Agrega un valor vacío para indicar que el token opcional no está presente
                            optionMatched = true;
                        }
                        break;
                    case GrammarOption.ONEORMORE:
                        List<String> allValues = new ArrayList<>();
                        if (option.options.contains(GrammarOption.ALL)) {
                            while (pos < tokens.size() && tokens.get(pos).type != TypeToken.EOF) {
                                allValues.add(tokens.get(pos).value);
                                pos++;
                                optionMatched = true;
                            }
                        } else {
                            while (match(option.options, allValues)) {
                                optionMatched = true;
                            }
                        }
                        if (allValues.isEmpty()) {
                            optionMatched = false;
                        } else {
                            values.addAll(allValues);
                        }
                        break;
                    case GrammarOption.ZERORMORE:
                        allValues = new ArrayList<>();
                        if (option.options.contains(GrammarOption.ALL)) {
                            while (pos < tokens.size() && tokens.get(pos).type != TypeToken.EOF) {
                                allValues.add(tokens.get(pos).value);
                                pos++;
                                optionMatched = true;
                            }
                        } else {
                            while (match(option.options, allValues)) {
                                optionMatched = true;
                            }
                        }
                        values.addAll(allValues);
                        optionMatched = true; // Siempre será verdadero porque cero es una opción válida
                        break;
                }
                if (!optionMatched) {
                    pos = startPos;
                    return false;
                }
            }
        }
        return true;
    }

    private static class GrammarRule {
        List<Object> pattern;
        Consumer<List<String>> action;

        GrammarRule(List<Object> pattern, Consumer<List<String>> action) {
            this.pattern = pattern;
            this.action = action;
        }
    }
}
