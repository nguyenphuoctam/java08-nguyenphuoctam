package com.phuoctam.Lesson02_Date01;

public class Ex01 {
	public static void main(String[] args) {
		//không dùng biến phụ
		int a = 10, b = 25, c = 1;
		if (a < b) {
			if (b < c) {
				System.out.println(a + "," + b + "," + c);
			} else {
				if (a < c) {
					System.out.println(a + "," + c + "," + b);
				} else {
					System.out.println(c + "," + a + "," + b);
				}
			}
		}else {
			if(a<c) {
				System.out.println(b+","+a+","+c);
			}else {
				if(b<c) {
					System.out.println(b+","+c+","+a);
				}else {
					System.out.println(c+","+b+","+a);
				}
			}
		}
	}
}
/*
 * Viết chương trình nhập vào ba số nguyên. Hãy in ba số này ra màn hình theo
 * thứ tự tăng dần và chỉ dùng tối đa một biến phụ
 * -----------------------------------------------------------------------------
 * --------------------- VD: Input 5 9 8 => Output: 5 8 9 Gợi ý: Có thể cho sẵn
 * giá trị 3 biến bất kì. Không cần nhập xuất mất thời gian
 */