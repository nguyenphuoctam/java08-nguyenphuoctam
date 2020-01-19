package com.phuoctam.Lesson02_Date01;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(factorial(4) + factorial(7) + factorial(12) + factorial(18));
	}

	private static long factorial(int inputNumber) {
		long result = 1;
		for (int i = 2; i <= inputNumber; i++) {
			result *= i;
		}
		return result;
	}
}
//Viết chương trình tính tổng S = 4! +7! + 12! + 18!
