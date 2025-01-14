package singleton;

public class DatabaseConnection {
	private static DatabaseConnection instance;
	private DatabaseConnection() {
		// Privatni konstruktor kako bi se sprečilo stvaranje instanci izvan klase
			System.out.println("Kreirana je konekcija sa bazom");
		}
		public static DatabaseConnection getInstance() {
		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
}
