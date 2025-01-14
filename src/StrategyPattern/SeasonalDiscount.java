package StrategyPattern;

class SeasonalDiscount implements IDiscountStrategy {
	@Override
	public double applyDiscount(double price) {
		return price * 0.8; // 20% popusta za sezonske akcije
	}
}