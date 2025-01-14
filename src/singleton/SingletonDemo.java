package singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		// Dobijanje instance klase DatabaseConnection
		DatabaseConnection connection1 = DatabaseConnection.getInstance();
		DatabaseConnection connection2 = DatabaseConnection.getInstance();
		// Provera da li su obe instance iste
		if (connection1 == connection2) {
			System.out.println("Obe instance su identične.");
			} else {
					System.out.println("Instance nisu iste.");
		}
	}
}
