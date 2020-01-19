package com.phuoctam.datatype;

public class Ex05ObjectEx02 {
	public static void main(String[] args) {
		int a =10;
		int b=5;
		System.out.println("a: "+a);
		System.out.println("b:" +b);
		
		System.out.println("============");
		Int x = new Int(88);
		Int y = new Int(100);
		swap(x, y);
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
	
	private static int swap(int a,int b) {
		return a;
	}
	
	private static void swap(Int a, Int b) {
		int tmp = a.value;
		a.value = b.value ;
		b.value=tmp;
	}
}

class Int{
	public int value;
	
	public Int(int value) {
		this.value=value;
	}
	
	@Override
	public String toString() {
		return ""+value;
	}
}
