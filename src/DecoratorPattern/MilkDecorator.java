package DecoratorPattern;

class MilkDecorator extends CoffeeDecorator {
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}
	@Override
	public double cost() {
		return super.cost() + 1.5; // Dodajemo cenu mleka
	}
}
