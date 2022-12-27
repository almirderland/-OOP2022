package PracticeLec;

import java.util.Vector;

public class TestSh {
	public static void main(String[] args) {
		Vector<Shape> sh = new Vector<Shape>();
		sh.add(new Circle(Color.RED, 4, 4));
		sh.add(new Triangle(Color.BLACK, 5));
		sh.add(new Square(Color.RED, 6, 4, 6));
		for (Shape s: sh) {
			s.draw();
	}
}}
