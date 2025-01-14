package DecoratorPattern;

abstract class CoffeeDecorator implements Coffee {
	protected Coffee coffee; // Objekat koji ćemo obogatiti
	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
		public double cost() {
	return coffee.cost();
	}
}
