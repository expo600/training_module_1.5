package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Iphone;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Button;
import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.GUIFactory;
import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Icon;
import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Menu;

public class IphoneFactory implements GUIFactory {
    @Override
    public Button getButton() {
        return new IphoneButton();
    }

    @Override
    public Icon getIcon() {
        return new IphoneIcon();
    }

    @Override
    public Menu getMenu() {
        return new IphoneMenu();
    }
}
