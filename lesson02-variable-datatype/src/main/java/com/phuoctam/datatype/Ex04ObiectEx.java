package com.phuoctam.datatype;

public class Ex04ObiectEx {
	public static void main(String[] args) {
//		char c = '5';
//		System.out.println(Character.isDigit(c));

		Integer a = new Integer(10);
		System.out.println("a: " + a);
		System.out.println("a1 system hascode "+System.identityHashCode(a));
		modified(a);
		System.out.println("a: " + a);
		System.out.println("a2 system hascode "+System.identityHashCode(a));
		System.out.println("==================");
		Integer x = new Integer(17);
		Integer y = new Integer(22);
		swap(x, y);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

	private static void modified(int a) {
		a = 20;
		System.out.println("a3 system hascode "+System.identityHashCode(a));
	}

	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
	}
}
