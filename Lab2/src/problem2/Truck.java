package problem2;

import java.util.Objects;

public class Truck extends Car {
	private int loadСapacity;
	private int height;

    public Truck() {
        super();
    }

    public Truck(String name, String brand, int maxSpeed, int loadСapacity, int height) {
        super(name, brand, maxSpeed);
        this.loadСapacity = loadСapacity;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLoadСapacity() {
        return loadСapacity;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLoadСapacity(int loadСapacity) {
        this.loadСapacity = loadСapacity;
    }

    public String toString() {
        return super.toString() + " Load Сapacity " + getLoadСapacity() + " Height " + getHeight();
    }
    public boolean equals (Object o) {
    	if (!super.equals(o)) return false;
    	Truck cr = (Truck)o;
    	return this.loadСapacity == cr.loadСapacity && this.height == cr.height;
    }
    public int hashCode() {
        return Objects.hash(super.getName(), super.getBrand(), super.getMaxSpeed(), loadСapacity, height );
    }
}
