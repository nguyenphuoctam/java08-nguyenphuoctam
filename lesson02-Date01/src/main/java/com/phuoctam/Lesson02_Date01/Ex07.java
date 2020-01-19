package com.phuoctam.Lesson02_Date01;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int[] arrNumber = new int[5];
		inputArrNumber(arrNumber);
		showArray(arrNumber);
	}

	private static void showArray(int[] arrNumber) {
		for (int i = 0; i < arrNumber.length; i++) {
			System.out.print(arrNumber[i] + ",");
		}
	}

	private static int[] inputArrNumber(int[] arrNumber) {
		Random rd = new Random();
		int temp = 0;
		for (int i = 0; i < arrNumber.length;) {
			temp = rd.nextInt(11) + 20;
			if (!isDuplicate(temp, arrNumber)) {
				arrNumber[i] = temp;
				i++;
			}
		}
		return arrNumber;
	}

	private static boolean isDuplicate(int item, int[] arrNumber) {
		for (int i = 0; i < arrNumber.length; i++) {
			if (item == arrNumber[i]) {
				return true;
			}
		}
		return false;
	}
}
/*
 * Viết chương trình random 5 số nguyên ngẫu nhiên từ 20 – 30. Yêu cầu: 5 số
 * ngẫu nhiên không được trùng nhau và trả về mảng 1 chiều Gợi ý: Cách khai báo
 * mảng: 1. int[] a = new int[5]; // a gồm 5 phần tử, giá trị mặc định bằng 0 2.
 * int[] a = {7,2,9,4}; // a gồm 4 phần tử, với a[0] = 7, ... a[3] = 4
 */