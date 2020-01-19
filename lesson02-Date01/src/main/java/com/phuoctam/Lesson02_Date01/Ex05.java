package com.phuoctam.Lesson02_Date01;

public class Ex05 {
	public static void main(String[] args) {
		int inputNumber = 23;
		System.out.println(convertDecimalToBinary(inputNumber));
	}

	private static String convertDecimalToBinary(int inputNumber) {
		String result = "";
		while (inputNumber > 0) {
			result = String.valueOf(inputNumber % 2) + result;
			inputNumber /= 2;
		}
		return result;
	}

}
/*
 * Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ
 * số 2
 */