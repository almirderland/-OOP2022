package Practice3;

public class Staff extends Person {
	String school;
	double pay;
	
	Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return this.pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String toString() {
		return "My name is " + getName() + "\nMy address is " + getAddress() +"\nMy school " + getSchool() + "\nMy pay " + getPay()+"\n";
	} 


	
}
