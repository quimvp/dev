package com.java.components.util.function;

@FunctionalInterface
public interface TriFunction<FP, SP, TP, R> {
	R apply(FP fp, SP sp, TP tp);
}
