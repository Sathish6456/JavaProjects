package com.zensar.training.bean;

@FunctionalInterface
public interface Executable<T> {
	int execute(T t);
}
