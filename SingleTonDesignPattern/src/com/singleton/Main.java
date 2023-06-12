package com.singleton;

public class Main {
	public static void main(String[] args) {
          
		
		SingleTonExample instance1 = SingleTonExample.getInstance(); //1066376662
		SingleTonExample instance2 = SingleTonExample.getInstance();//1066376662
	
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
