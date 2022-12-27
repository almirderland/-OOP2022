package problem1;

import java.util.Objects;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(boolean filled, double radius, double height) {
        super(filled);
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public String toString() {
        return super.toString() + " For Cylinder";
    }
    public boolean equals (Object o) {
    	if (!super.equals(o)) return false;
    	Cylinder sh = (Cylinder)o;
    	return this.radius == sh.radius && this.height == sh.height;
    }
    public int hashCode() {
    	return Objects.hash(super.getFilled(), radius, height);
    }
}