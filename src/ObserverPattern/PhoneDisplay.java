package ObserverPattern;

//Concrete Observers
class PhoneDisplay implements IObserver {
	@Override
	public void update(float temperature) {
		System.out.println("PhoneDisplay: Temperature updated to " + temperature + "°C");
	}
}