package Practice3;

import java.util.Vector;

public class TestB {

	public static void main(String[] args) {
		Staff s1 = new Staff ("Almira", "Tole bi 59","166", 10000.0 );
		Student s2 = new Student ("ERTY", "Tole bi 59","oop", 3, 123.3 );
		Person p1 = new Person ("Lala", "Tole bi 59");
		Staff s3 = new Staff ("Erlan", "Abd 16","130", 10000.0 );
		
		Vector<Person> p = new Vector<Person>();
		p.add(s1);
		p.add(s3);
		p.add(s2);
		p.add(p1);
		
		System.out.println(p);

	}

}
