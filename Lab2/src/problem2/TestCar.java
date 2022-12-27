package problem2;

import java.util.HashSet;
import java.util.Vector;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Car> cr = new Vector<Car>();
		cr.add(new ElectroCar("Model X", "Tesla", 255, 100));
		cr.add(new ElectroCar("Model Y", "Tesla", 217, 100));
		cr.add(new Truck("F3000", "Shacman", 90, 60, 2));
//		for (Car c : cr) {
//			System.out.println(c.toString());
//		}
		HashSet<Car> car = new HashSet<>();
	    car.add(new ElectroCar("Model X", "Tesla", 255, 100));
	    car.add(new ElectroCar("Model Y", "Tesla", 217, 100));
		car.add(new Truck("F3000", "Shacman", 90, 60, 2));
		car.add(new Truck("F3000", "Shacman", 90, 60, 2));
		car.add(new Truck("F3000", "Shacman", 90, 60, 2));
	    System.out.println(car);
	}

}
