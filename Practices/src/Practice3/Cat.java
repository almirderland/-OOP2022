package Practice3;

public class Cat extends Animal  {


	public Cat(String name) {
		super(name);
	}
	
	public String toString(){
	return "Hello, I am "+name+" and I say "+speak()+"";
	}
	
	public String speak(){
		return "Meow";
		}
	
	public void foot(){
		System.out.println("Wiskas");
		}
}
