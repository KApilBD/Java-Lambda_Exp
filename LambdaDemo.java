package com.javaPractice.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		
//		A obj = new A(){
//			
//			public void show(){
//				System.out.println("Hello");
//			}
//		};
//		
		A obj =()->
				System.out.println("Hello");

		
			
	    obj.show();
	    obj.display();
				
		
		
	}

}

//class xyz implements A{
//
//	@Override
//	public void show() {
//		System.out.println("Hello");
//	}
//	
//	
//}
