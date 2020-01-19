package random;

import java.util.Random;

public class Ex01Number {
	public static void main(String[] args) throws InterruptedException {
		do {
			Random rd = new Random();
			int number = rd.nextInt(10);
			System.out.println(number);
			sleep(1);
		} while (true);
	}
	
	private static void sleep(long second) throws InterruptedException {
		Thread.sleep(second);
	}
}
