package problem1;

import java.util.Objects;

public class Cube extends Shape {
    public double side;

    public Cube() {
        super();
    }

    public Cube(boolean filled, double side) {
        super(filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double volume() {
        return Math.pow(side, 3);
    }

    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    public String toString() {
        return super.toString() + " For Cube";
    }
    public boolean equals (Object o) {
    	if (!super.equals(o)) return false;
    	Cube sh = (Cube)o;
    	return this.side == sh.side;
    }
    public int hashCode() {
    	return Objects.hash(super.getFilled(), side);
    }
}
