package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Android;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Button;
import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.GUIFactory;
import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Icon;
import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Menu;

public class AndroidFactory implements GUIFactory {
    @Override
    public Button getButton() {
        return new AndroidButton();
    }

    @Override
    public Icon getIcon() {
        return new AndroidIcon();
    }

    @Override
    public Menu getMenu() {
        return new AndroidMenu();
    }
}
