package com.phuoctam.Lesson02_Date01;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println(thePrimes(200));
	}

	private static int thePrimes(int input) {
		int step = 0;
		int temp = 2;
		while (true) {
			if (isPrime(temp)) {
				step++;
				if (input == step) {
					return temp;
				} else {
					temp++;
				}
			} else {
				temp++;
			}
		}
	}

	private static boolean isPrime(int inputNumber) {
		for (int i = 2; i <= inputNumber / 2; i++) {
			if (inputNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}
