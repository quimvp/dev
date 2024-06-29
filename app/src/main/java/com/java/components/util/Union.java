package com.java.components.util;

import java.util.Arrays;

import com.java.components.lang.CompilerTaskException;

public class Union {
    private Object value;
    private Class<?>[] type;

    public Union(Class<?>... type) {
        if(type == null || type.length == 0) throw new CompilerTaskException("Class not founds: " + type + ", or is null");
        this.type = Arrays.copyOf(type, type.length);
    }

    public void set(Object o) {
        if(o != null) {
            boolean isValidType = Arrays.stream(type).anyMatch(clazz -> clazz.isInstance(o));

            if(isValidType) this.value = o;
            else {
                StringBuilder sb = new StringBuilder();
                for (Class<?> clazz : type) sb.append(clazz.getSimpleName()).append(" | ");
                sb.delete(sb.length() - 3, sb.length());
                throw new CompilerTaskException("Invalid type only is supported: " + sb.toString() + ", found: " + o.getClass().getSimpleName());
            }
        }
    }

    public Object get() {
        return value;
    }
}