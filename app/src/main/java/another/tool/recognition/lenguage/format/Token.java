package another.tool.recognition.lenguage.format;

public class Token {
    private String value;
    private Enum<?> type;

    public Token(String value, Enum<?> type) {
        this.value = value;
        this.type = type;
    }
}