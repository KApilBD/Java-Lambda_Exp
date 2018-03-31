package com.javaPractice.lambda;

public interface A {

	void show();
	
	default void display(){
		System.out.println("Heyyyyyyyyyy!!!");
	}
}
