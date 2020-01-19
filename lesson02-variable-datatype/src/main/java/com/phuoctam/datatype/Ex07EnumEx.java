package com.phuoctam.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {
	public static void main(String[] args) {
		Point A = new Point(3, 4);
		Point O = new Point(0, 0);

		int R = 5;
		CirclePosition pos = getPointStatusWithCircle(A, O, R);
		System.out.println("Result : " + pos.value);
		double a = 1.1;

	}

	// refactor
	private static CirclePosition getPointStatusWithCircle(Point A, Point O, int R) {
		double distance = Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
		return distance == R ? CirclePosition.ONSIDE : distance < R ? CirclePosition.INSIDE : CirclePosition.OUTSIDE;
	}
}
