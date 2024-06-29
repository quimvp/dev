package com.java.components.util;

import java.util.Arrays;

import com.java.components.lang.CompilerTaskException;
import static com.java.components.Prints.*;

public class Tuple {
    private Object item1, item2, item3, item4, item5;

    public <T> Tuple(T item1) {
        println("Please use 'Set<?>' or 'List<?>' and not this clase");
        this.item1 = item1;
        this.item2 = null;
        this.item3 = null;
        this.item4 = null;
        this.item5 = null;
    }

    public <T, T2> Tuple(T item1, T2 item2) {
        this(item1, item2, null);
    }

    public <T, T2, T3> Tuple(T item1, T2 item2, T3 item3) {
        this(item1, item2, item3, null);
    }

    public <T, T2, T3, T4> Tuple(T item1, T2 item2, T3 item3, T4 item4) {
        this(item1, item2, item3, item4, null);
    }

    public <T, T2, T3, T4, T5> Tuple(T item1, T2 item2, T3 item3, T4 item4, T5 item5) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
    }

    public <T> void setItem1(T item1) {
        if(this.item1 == null) throw new CompilerTaskException("Not found 'Item'");
        this.item1 = item1;
    }

    public <T2> void setItem2(T2 item2) {
        if(this.item2 == null) throw new CompilerTaskException("Not found 'Item'");
        this.item2 = item2;
    }

    public <T3> void setItem3(T3 item3) {
        if(this.item3 == null) throw new CompilerTaskException("Not found 'Item'");
        this.item3 = item3;
    }

    public <T4> void setItem4(T4 item4) {
        if(this.item4 == null) throw new CompilerTaskException("Not found 'Item'");
        this.item4 = item4;
    }

    public <T5> void setItem5(T5 item5) {
        if(this.item5 == null) throw new CompilerTaskException("Not found 'Item'");
        this.item5 = item5;
    }

    public <T> T getItem1() {
        if(item1 == null) throw new CompilerTaskException("Not found 'Item'");
        return (T) item1;
    }

    public <T2> T2 getItem2() {
        if(item2 == null) throw new CompilerTaskException("Not found 'Item'");
        return (T2) item2;
    }

    public <T3> T3 getItem3() {
        if(item3 == null) throw new CompilerTaskException("Not found 'Item'");
        return (T3) item3;
    }

    public <T4> T4 getItem4() {
        if(item4 == null) throw new CompilerTaskException("Not found 'Item'");
        return (T4) item4;
    }

    public <T5> T5 getItem5() {
        if(item5 == null) throw new CompilerTaskException("Not found 'Item'");
        return (T5) item5;
    }
}