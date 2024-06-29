package com.java.components.util.function;

public interface QuinFunction<FP, SP, TP, FP2, QP, R> {
	R apply(FP fp, SP sp, TP tp, FP2 f2, QP qp);
}
