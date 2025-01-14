package DecoratorPattern;

public class Main {
	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee(); // Početna kafa
		System.out.println("Cost of simple coffee: " + coffee.cost());
		// Dodajemo mleko
		coffee = new MilkDecorator(coffee);
		System.out.println("Cost of coffee with milk: " + coffee.cost());
		// Dodajemo šećer
		coffee = new SugarDecorator(coffee);
		System.out.println("Cost of coffee with milk and sugar: " + coffee.cost());
	}
}