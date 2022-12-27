package Lab1;

public class TestD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dragon dragon = new Dragon();
        Person p1 = new Person(Gender.BOY);
        Person p2 = new Person(Gender.BOY);
        Person p5 = new Person(Gender.GIRL);
        Person p3 = new Person(Gender.GIRL);
        Person p4 = new Person(Gender.GIRL);
        dragon.kidnap(p1);
        dragon.kidnap(p2);
        dragon.kidnap(p3);
        dragon.kidnap(p4);
        dragon.kidnap(p5);
        if(dragon.willDragonEatOrNot())
            System.out.println("He will eat");
        else 
            System.out.println("He will not eat");
	}

}
