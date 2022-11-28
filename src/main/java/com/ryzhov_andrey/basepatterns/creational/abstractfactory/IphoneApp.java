package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Iphone.IphoneFactory;

public class IphoneApp {
    public static void main(String[] args) {
        GUIFactory guiFactory = new IphoneFactory();
        Button button = guiFactory.getButton();
        Menu menu = guiFactory.getMenu();
        Icon icon = guiFactory.getIcon();

        button.draw();
        menu.draw();
        icon.draw();
    }
}
