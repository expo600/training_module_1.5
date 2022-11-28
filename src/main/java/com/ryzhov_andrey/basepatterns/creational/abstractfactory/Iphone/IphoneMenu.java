package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Iphone;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Menu;

public class IphoneMenu implements Menu {
    @Override
    public void draw() {
        System.out.println("Draw menu for iphone");
    }
}
