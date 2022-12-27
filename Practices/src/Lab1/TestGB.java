package Lab1;

import java.util.Scanner;

public class TestGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c = new Course("Object-oriented Programming and Design", "CSCI2601");
		Student s1 = new Student("Almira", 1);
		Student s2 = new Student("Erlan", 2 );
		Student s3 = new Student("Dayana", 12);
		Student s4 = new Student("Alan", 4);
		Student s5 = new Student("Zhaniya", 23);
		
		GradeBook gb = new GradeBook();
		
		gb.addStudent(s1);
		gb.addStudent(s2);
		gb.addStudent(s3);
		gb.addStudent(s4);
		gb.addStudent(s5);
		
		System.out.println(gb.displayMessage(c));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, input grades for students:");
		for(int i = 0;i < gb.students.size();i++) {
			System.out.print(gb.students.get(i).toString());
			int points = input.nextInt();
			gb.students.get(i).setGrade(points);
		}
		
		System.out.println(gb.displayGradeReport());
		System.out.println("Grades distribution:");
		gb.gradeTotal();

	}

}
