package StrategyPattern;

//Klasa koja koristi strategiju
public class Product {
	private String name;
	private double price;
	private IDiscountStrategy discountStrategy;
	public Product(String name, double price, IDiscountStrategy discountStrategy) {
		this.name = name;
		this.price = price;
		this.discountStrategy = discountStrategy;
	}
	public double getPrice() {
		return discountStrategy.applyDiscount(price);
	}
}
