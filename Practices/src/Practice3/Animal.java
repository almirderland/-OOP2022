package Practice3;

public class Animal {
	String name;
	public Animal(String name){
		this.name = name;
	}

	public String toString(){
		return "Hello, I am "+name+"";
	}

	public String speak(){
		return "No voice";
	}
	
	public String speak(int num) {
		return speak().repeat(num);
	}
	
	public void food(){
		System.out.println("");
	}	
}
