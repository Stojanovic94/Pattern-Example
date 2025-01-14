package ObserverPattern;

//Main klasa za demonstraciju Observer patterna
public class ObserverPatternDemo {
	public static void main(String[] args) {
		//Kreiramo WeatherStation objekat koji je subject
		WeatherStation station = new WeatherStation();
		//Kreiramo dva različita observera koji će se prijaviti na promene
		IObserver phoneDisplay = new PhoneDisplay();
		IObserver publicDisplay = new PublicDisplay();
		//Dodajemo observere u listu posmatrača WeatherStation objekta
		station.addObserver(phoneDisplay);
		station.addObserver(publicDisplay);
		//Postavljamo temperaturu, što izaziva obaveštavanje svih posmatrača
		station.setTemperature(25.0f); // Svi posmatrači će biti obavešteni o ovoj promeni
		station.setTemperature(30.0f); // Isto
	}
}