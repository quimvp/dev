package com.java.components.lang;

import java.lang.IllegalStateException;

public class CompilerTaskException extends IllegalStateException {

    public CompilerTaskException(String msg) {
        super(msg);
    }

    public CompilerTaskException(Throwable cause) {
        super(cause);
    }

    public CompilerTaskException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
