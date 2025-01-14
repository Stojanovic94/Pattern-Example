package StrategyPattern;

//Main klasa
public class StrategyPatternDemo {
	public static void main(String[] args) {
			// Kreiramo proizvode sa različitim strategijama popusta
			Product product1 = new Product("Laptop", 1000, new PercentageDiscount(10)); // 10% popusta
			Product product2 = new Product("Phone", 800, new FixedDiscount(50)); // 50 fiksni popust
			Product product3 = new Product("TV", 1200, new SeasonalDiscount()); // 20% sezonski popust
			// Prikazivanje cena sa popustima
			System.out.println("Laptop cena sa popustom: " + product1.getPrice());
			System.out.println("Phone cena sa popustom: " + product2.getPrice());
			System.out.println("TV cena sa popustom: " + product3.getPrice());
		}
}
