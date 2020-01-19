package com.phuoctam.Lesson02_Date01;

public class Ex04 {
	public static void main(String[] args) {
		int[] arrNumber = { 50, 10, -99, 110, 20, 21, 30 };
		System.out.println(sencondLargestOddNumber(arrNumber));
	}

	private static String sencondLargestOddNumber(int[] arrNumber) {
		int largestOddNumber = Integer.MIN_VALUE, sencondLargestOddNumber = Integer.MIN_VALUE;
		int step = 0;
		for (int i = 0; i < arrNumber.length; i++) {
			int itemNumber = arrNumber[i];
			if (itemNumber % 2 != 0 && itemNumber > largestOddNumber) {
				sencondLargestOddNumber = largestOddNumber;
				largestOddNumber = itemNumber;
				step++;
			}
		}
		if (step <= 1) {
			return "This array has no second largest odd number";
		}
		return String.valueOf(sencondLargestOddNumber);
	}
}
/*
 * Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. Tìm số lẻ lớn
 * nhất thứ hai trong dãy số và in ra. Gợi ý : 5 1 9 11 20 19 17 21 30 => Kết
 * quả : 19
 */