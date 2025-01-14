package DecoratorPattern;

class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}
	@Override
	public double cost() {
		return super.cost() + 0.5; // Dodajemo cenu šećera
	}
}
