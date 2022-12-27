package problem1;

import java.util.HashSet;
import java.util.Vector;

public class TestShapes {

	public static void main(String[] args) {
		Vector<Shape> sh = new Vector<Shape>();
		sh.add(new Cylinder(true, 4.0, 2.0));
		sh.add(new Cylinder(false, 2.0, 2.0));
		sh.add(new Cube(false, 5));
		sh.add(new Sphere(true, 4));
		for (Shape s: sh) {
			System.out.println(s.volume());
		}
		HashSet<Shape> shape = new HashSet<>();
		shape.add(new Cylinder(true, 4.0, 2.0));
		shape.add(new Cylinder(false, 2.0, 2.0));
		shape.add(new Cube(false, 5));
		shape.add(new Sphere(true, 4));
		shape.add(new Sphere(true, 4));
		shape.add(new Sphere(true, 4));
	    System.out.println(shape);
	}
}