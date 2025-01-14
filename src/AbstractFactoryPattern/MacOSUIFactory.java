package AbstractFactoryPattern;

class MacOSUIFactory implements UIFactory {
	public Button createButton() {
		return new MacOSButton();
	}
	public Menu createMenu() {
		return new MacOSMenu();
	}
}
