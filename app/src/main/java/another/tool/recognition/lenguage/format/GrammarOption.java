package another.tool.recognition.lenguage.format;

import java.util.List;

public class GrammarOption {
    public static final int ALTERNATIVE = 0;
    public static final int OPTIONAL = 1;
    public static final int ONEORMORE = 2;
    public static final int ZERORMORE = 3;
    public static final boolean ALL = true;
    List<Object> options;
    int type;

    public GrammarOption(int type, Object... options) {
        this.type = type;
        this.options = List.of(options);
    }
}
