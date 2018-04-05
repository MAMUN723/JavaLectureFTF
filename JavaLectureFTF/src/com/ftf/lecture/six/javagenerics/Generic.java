package com.ftf.lecture.six.javagenerics;

public class Generic<T> {
	
	private T obj;
	
	public Generic(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	public void showType() {
		System.out.println("Type of T is: " + obj.getClass().getName()); 
	}

}
