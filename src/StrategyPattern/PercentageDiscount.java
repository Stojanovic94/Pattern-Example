package StrategyPattern;

//Konkretne strategije popusta
class PercentageDiscount implements IDiscountStrategy {
	private double percentage;
		public PercentageDiscount(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public double applyDiscount(double price) {
		return price - (price * (percentage / 100));
	}
}