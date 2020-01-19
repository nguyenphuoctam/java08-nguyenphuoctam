package random;

import java.util.Random;

public class Ex02Array {
	public static void main(String[] args) {
		Random rd = new Random();
		String[] students = { "Lan", "hoa", "dao", "mai" };

		String firstStudent = students[rd.nextInt(students.length)];

		String secondStudent = students[rd.nextInt(students.length)];

		while (secondStudent.equals(firstStudent)) {
			secondStudent = students[rd.nextInt(students.length)];
		}
		System.out.println(firstStudent + "  " + secondStudent);
		System.out.println("==================");
		for (String student : students) {
			System.out.println(student);
		}
	}
}
