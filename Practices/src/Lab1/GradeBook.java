package Lab1;

import java.util.Vector;

public class GradeBook {
	int sum = 0;
	int average, maxi, mini;
	
	public Vector<Student> students = new Vector<Student>();
	
	public void addStudent(Student s) {
		students.add(s);
	}
	GradeBook(){
		
	}
	public String displayMessage(Course c) {
		return "Welcome to the grade book for " + c.toString() + "!";
	}
	
	public int determineClassAverage() {
		for(int i = 0; i < students.size();i++) {
			sum += students.get(i).getGrade();
		}
		average = sum / students.size();
		return average;
	}
	
	public String determineClassLow(){
		String minName = null;
		int minID = 0;
		mini = students.get(0).getGrade();
		for(int i = 0; i < students.size(); i++) {
			if(mini > students.get(i).getGrade()) {
				mini = students.get(i).getGrade();
				minName = students.get(i).getName();
				minID = students.get(i).getID();
			}
		}
		return mini + "(Student " + minName + ", id: " + minID + ")";
	}
	
	public String determineClassHigh(){
		String maxName = null;
		int maxID = 0;
		maxi = students.get(0).getGrade();
		for(int i = 0; i < students.size(); i++) {
			if(maxi < students.get(i).getGrade()) {
				maxi = students.get(i).getGrade();
				maxName = students.get(i).getName();
				maxID = students.get(i).getID();
			}
			
		}
		
		return maxi + "(Student " + maxName + ", id: " + maxID + ")";
		
	}
	
	public String displayGradeReport() {
		return "Class average is " + determineClassAverage() + ". Lowest grade is " + determineClassLow() + ". Highest grade is " + determineClassHigh();
	}
	
	public void gradeTotal() {
		int points0 = 0; 
		int points1 = 0;
		while(points0 <= 99) {
			points1 = points0 + 9;
			System.out.print(points0 + "-" + points1 + ": ");
			for(int i = 0; i < students.size(); i++) {
				if(students.get(i).getGrade() > points0 && students.get(i).getGrade() < points1 ) {
					System.out.print("*");
				}
			}
			System.out.println();
			points0 = points1 + 1;
			
		
		}
		System.out.print("100: ");
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getGrade() == 100) {
				System.out.print("*");
			}
		}
	}
	
}
