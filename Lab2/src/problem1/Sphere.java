package problem1;

import java.util.Objects;

public class Sphere extends Shape {
    private double radius;

    public Sphere() {
        super();
    }

    public Sphere(boolean filled, double radius) {
        super(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return super.toString() + " For Sphere";
    }
    public boolean equals (Object o) {
    	if (!super.equals(o)) return false;
    	Sphere sh = (Sphere)o;
    	return this.radius == sh.radius;
    }
    public int hashCode() {
    	return Objects.hash(super.getFilled(), radius);
    }
}
