package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Android;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Menu;

public class AndroidMenu implements Menu {
    @Override
    public void draw() {
        System.out.println("Draw menu for android");
    }
}
