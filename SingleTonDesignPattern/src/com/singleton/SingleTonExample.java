package com.singleton;

public class SingleTonExample {
   
	//lazy 
	public static SingleTonExample singleTonExample = null;
	
	/*
	 * if you declare the constructor private no any one create object
	 */
	private SingleTonExample() {
		
	  
	}
	
	//for thread safe declare method as 
	public static synchronized   SingleTonExample getInstance() {
		          
		if(singleTonExample==null) {
			singleTonExample = new SingleTonExample();
		}
		
		return singleTonExample;
	}
	
	public void display() {
		System.out.println("this is the example of singlotone");
	}
	
}
