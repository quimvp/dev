package com.java.components.lang;

import java.io.Serializable;

public class StringBuilders implements Serializable, CharSequence {
    private char value[];
    private int count;

    public StringBuilders() {
        this(16);
    }

    public StringBuilders(String str) {
        value = str.toCharArray();
        count = value.length;
    }

    public StringBuilders(int capacity) {
        value = new char[capacity];
        count = value.length;
    }

    void expandCapacity(int newCapacityParam) {
        int newCapacity = (value.length + 1) * 2;
        if(newCapacity < 0) newCapacity = Integer.MAX_VALUE;
        else if(newCapacityParam > newCapacity) newCapacityParam = newCapacityParam;
        char newValue[] = new char[newCapacity];
        System.arraycopy(value, 0, newValue, 0, count);
        value = newValue;
    }

    public int length() {
        return count;
    }

    public int capacity() {
        return value.length;
    }

    public StringBuilders append(String str) {
        if(str == null) str = "null";
        int len = str.length();
        if(len == 0) return this;
        int newCount = count + len;
        if(newCount > value.length) expandCapacity(newCount);
        str.getChars(0, len, value, count);
        count = newCount;
        return this;
    }

    public StringBuilders append(boolean b) {
        if(b) {
            int newCount = count + 4;
            if(newCount > value.length) expandCapacity(newCount);
            value[count++] = 't';
            value[count++] = 'r';
            value[count++] = 'u';
            value[count++] = 'e';
        } else {
            int newCount = count + 5;
            if(newCount > value.length) expandCapacity(newCount);
            value[count++] = 'f';
            value[count++] = 'a';
            value[count++] = 'l';
            value[count++] = 's';
            value[count++] = 'e';
        }
        return this;
    }

    public StringBuilders append(char c) {
        int newCount = count + 1;
        if(newCount > value.length) expandCapacity(newCount);
        value[count++] = c;
        return this;
    }

    public StringBuilders append(StringBuilders child) {
        this.append(child.toString());
        return this;
    }

    public char charAt(int index) {
        return value[index];
    }

    public void setCharAt(int index, char ch) {
        value[index] = ch;
    }

    public CharSequence subSequence(int start, int end) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString() {
        return new String(value);
    }
}
