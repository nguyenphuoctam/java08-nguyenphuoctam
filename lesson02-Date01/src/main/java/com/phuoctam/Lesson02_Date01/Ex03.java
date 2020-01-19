package com.phuoctam.Lesson02_Date01;

public class Ex03 {
	public static void main(String[] args) {
		int inputNumber = 121;
		System.out.println(isSymmetricNumber(inputNumber));
	}

	private static boolean isSymmetricNumber(int inputNumber) {
		int tempInput = inputNumber;
		int inverseNumber = 0;
		if(inputNumber<10) {
			return false;
		}
		while (inputNumber > 0) {
			inverseNumber = inverseNumber * 10 + (inputNumber % 10);
			inputNumber /= 10;
		}
		return tempInput == inverseNumber;
	}
}
/*
 * Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay không
 * -----------------------------------------------------------------------------
 * --------------------- VD: 121 13331 là số đối xứng.
 */