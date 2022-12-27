package problem1;

import java.util.Objects;

public abstract class Shape {
    private boolean filled;

    public Shape() {}

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public abstract double volume();

    public abstract double surfaceArea();

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Volume: " + volume() + " Surface Area: " + surfaceArea() + (getFilled() ? " Filled" : " Not Filled");
    }
    
    public boolean equals (Object o) {
    	if (o == this) return true;
    	if (o == null) return false;
    	if (o.getClass() != this.getClass()) return false;
    	Shape sh = (Shape)o;
    	return this.filled == sh.filled;
    }
    public int hashCode() {
    	return Objects.hash(filled);
    }

}
