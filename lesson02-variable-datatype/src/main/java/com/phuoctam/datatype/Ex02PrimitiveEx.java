package com.phuoctam.datatype;

public class Ex02PrimitiveEx {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a : " + a);
		
		int b = 20;
		int c = b;
		b = 15;
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
		
	}

	private static void modified(int a) {
		a = 20;
	}

}
