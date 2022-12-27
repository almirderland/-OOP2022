package Practice2;

public class Student {
	private int id;
	private String name;
	private int yearOfStudy;
	Student(int id, String name, int yearOfStudy){
		this.id = id;
		this.name = name;
		this.yearOfStudy = yearOfStudy;
	}

	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	public int getyearOfStudy(){
		return this.yearOfStudy;
	} 
	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setyearOfStudy(int yearOfStudy){
		this.yearOfStudy = yearOfStudy;
	}
}
