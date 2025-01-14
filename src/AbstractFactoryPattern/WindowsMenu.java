package AbstractFactoryPattern;

//Konkretni meniji
class WindowsMenu implements Menu {
	public void render() {
		System.out.println("Rendering Windows Menu");
	}
}
