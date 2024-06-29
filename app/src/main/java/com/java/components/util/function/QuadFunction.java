package com.java.components.util.function;

@FunctionalInterface
public interface QuadFunction<FP, SP, TP, FP2, R> {
	R apply(FP fp, SP sp, TP tp, FP2 fp2);
}
