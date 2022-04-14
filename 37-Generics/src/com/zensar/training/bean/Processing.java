package com.zensar.training.bean;

public class Processing<T>{
	T data;
	
	public void setData(T obj) {
		this.data=obj;
	}
	
	public T getData() {
		return (T) this.data;
	}
}
