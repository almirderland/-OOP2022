package Lab1;

public class Course {
	public String name;
	public String description;
	public int cntCredit;
	public String prerequisite;
	
	Course(String name, String description){
		this.name = name;
		this.description = description;
	}
	public String toString() {
		return this.description + " " + this.name;
	}
}
