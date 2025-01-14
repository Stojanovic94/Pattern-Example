package DecoratorPattern;

public class SimpleCoffee implements Coffee {
	@Override
	public double cost() {
		return 5.0; // Osnovna cena kafe
	}
}
