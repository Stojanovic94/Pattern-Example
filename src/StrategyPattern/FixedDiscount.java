package StrategyPattern;

class FixedDiscount implements IDiscountStrategy {
	private double discount;
	public FixedDiscount(double discount) {
		this.discount = discount;
}
	@Override
	public double applyDiscount(double price) {
		return price - discount;
	}
}