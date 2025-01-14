package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

class WeatherStation {
private List<IObserver> observers = new ArrayList<>();
private float temperature;
	public void addObserver(IObserver observer) {
		observers.add(observer);
	}
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		notifyObservers();
	}
	private void notifyObservers() {
		for (IObserver observer : observers) {
		observer.update(temperature);
		}
	}
}