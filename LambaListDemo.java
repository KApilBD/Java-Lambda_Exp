package com.javaPractice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambaListDemo {

	public static void main(String[] args) {

		List<Integer> l =  Arrays.asList(1,2,3,4,5,6,7);
		
		
//		Consumer c =i ->
//				System.out.println(i);

		
	//	l.forEach(c); //2- How will we simplify it more
		
		
		l.forEach(i->System.out.println(i));//1- how does it work??
		

	}

}

class abc implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
	
}