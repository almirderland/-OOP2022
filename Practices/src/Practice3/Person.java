package Practice3;

public class Person {
	String name;
	String address;
	
	Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public String getName(){
		return this.name;
	}
	public void setAdress(String address){
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	public String toString(){
		return "My name is " + getName() + "\nMy address is " +getAddress()+"\n";
	}
}
