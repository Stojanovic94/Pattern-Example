package StrategyPattern;

class SeasonalDiscount implements IDiscountStrategy {
	@Override
	public double applyDiscount(double price) {
		
		// 20% popusta za sezonske akcije
		return price * 0.8;
	}
}
