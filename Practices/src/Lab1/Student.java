package Lab1;

public class Student {
	public String name;
	public int id;
	public int grade;
	

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		
	}
	public void setName(String name){
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getID() {
		return id;
	}
	public String toString() {
		return "Student " + this.name + ": ";
	}
}
