package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Android.AndroidFactory;

public class AndroidApp {
    public static void main(String[] args) {
        GUIFactory guiFactory = new AndroidFactory();
        Button button = guiFactory.getButton();
        Menu menu = guiFactory.getMenu();
        Icon icon = guiFactory.getIcon();

        button.draw();
        menu.draw();
        icon.draw();
    }
}