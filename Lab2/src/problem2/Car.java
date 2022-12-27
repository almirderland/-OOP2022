package problem2;

import java.util.Objects;

public abstract class Car{
    private String name;
    private String brand;
    private int maxSpeed;

    public Car() {}

    public Car(String name, String brand, int maxSpeed) {
        this.name = name;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "Car " + this.name + " Brand " + this.brand + " Max speed " + this.maxSpeed;
    }
    
    public boolean equals (Object o) {
    	if (o == this) return true;
    	if (o == null) return false;
    	if (o.getClass() != this.getClass()) return false;
    	Car cr = (Car)o;
    	return this.maxSpeed == cr.maxSpeed && this.name == cr.name && this.brand == cr.brand;
    }
    
    public int hashCode() {
    	return Objects.hash(name, brand, maxSpeed);
    }

}

