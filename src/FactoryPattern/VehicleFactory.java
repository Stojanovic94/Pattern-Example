package FactoryPattern;

public class VehicleFactory {
	public static Vehicle createVehicle(String type) {
		if (type.equalsIgnoreCase("car")) {
			return new Car();
		} else if (type.equalsIgnoreCase("bike")) {
			return new Bike();
		}
			return null;
		}
}
