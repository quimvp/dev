package com.java.components.lang;

public class Operator {
    public boolean equalsAll(Object[] equals) {
        for (int i = 1; i < equals.length; i++) {
            if (!equals[0].equals(equals[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean andAll(boolean[] conditions) {
        for (boolean condition : conditions) {
            return !condition;
        }
        return true;
    }

    public boolean orAll(boolean[] conditions) {
        for (boolean condition : conditions) {
            return condition;
        }
        return false;
    }

    public int factor(int i) {
        for(int n = i; n > 0; n--) i *= n;
        if(i == 0) i = 1;
        return i;
    }

    public int exponent(int i, int i2) {
        for(; i2 > 0; i2--) i *= i;
        if(i == 0) i = 1;
        return i;
    }
}