package ObserverPattern;

class PublicDisplay implements IObserver {
	@Override
	public void update(float temperature) {
		System.out.println("PublicDisplay: Temperature updated to " + temperature + "°C");
	}
}
