package FactoryPattern;

public class FactoryDemo {
	public static void main(String[] args) {
		// Kreiranje objekta tipa Car pomoću Factory metode
		Vehicle car = VehicleFactory.createVehicle("car");
		car.drive(); // Ispisuje: Driving a car
		
		// Kreiranje objekta tipa Bike pomoću Factory metode
		Vehicle bike = VehicleFactory.createVehicle("bike");
		bike.drive(); // Ispisuje: Riding a bike
		}
}
