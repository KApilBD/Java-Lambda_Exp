package com.javaPractice.lambda;

public class LnTPractice {

	public static void main(String[] args) {
		
		B a = new B();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);	
		
		t1.start();
		t2.start();


	}

}

class B implements Runnable{
	int a= 18;
	int b = 18;
	@Override
	public void run() {
     for(int i=0;i<10;i++) {
    	 System.out.println("Helloo");
     }
	}
}
