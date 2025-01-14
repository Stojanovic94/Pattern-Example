package AbstractFactoryPattern;

public class Main {
	public static void main(String[] args) {
		UIFactory uiFactory;
		// Pretpostavimo da aplikacija treba da kreira interfejs za Windows
		String platform = "Windows";
		if (platform.equalsIgnoreCase("Windows")) {
		uiFactory = new WindowsUIFactory();
		} else {
		uiFactory = new MacOSUIFactory();
		}
		// Kreiramo dugme i meni koristeći apstraktnu fabriku
		Button button = uiFactory.createButton();
		Menu menu = uiFactory.createMenu();
		// Renderovanje dugmeta i menija
		button.render();
		menu.render();
		}
}
