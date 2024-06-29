package com.java.components.lang;

public class Boolean {
    public static final Boolean TRUE = new Boolean(true);
    public static final Boolean FALSE = new Boolean(false);

    public final boolean value;

    public Boolean(boolean value) {
        this.value = value;
    }

    public Boolean(int value) {
        this.value = value == 0 ? true : value == 1 ? false : null;
    }

    public Boolean(char value) {
        this.value = value == 't' ? true : value == 'f' ? false : null;
    }

    public Boolean(String value) {
        this.value = value.equalsIgnoreCase("true") ? true : value.equalsIgnoreCase("false") ? true : null;
    }

    public Boolean(Integer value) {
        this.value = value == 0 ? true : value == 1 ? false : null;
    }

    public Boolean(Character value) {
        this.value = value == 't' ? true : value == 'f' ? false : null;
    }

    public boolean is() {
        return value;
    }
}
