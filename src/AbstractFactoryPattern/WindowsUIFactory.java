package AbstractFactoryPattern;

//Konkretne fabrike
class WindowsUIFactory implements UIFactory {
	public Button createButton() {
		return new WindowsButton();
	}
	public Menu createMenu() {
		return new WindowsMenu();
	}
}
