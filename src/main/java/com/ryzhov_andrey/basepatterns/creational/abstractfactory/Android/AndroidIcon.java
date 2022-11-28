package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Android;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Icon;

public class AndroidIcon implements Icon {
    @Override
    public void draw() {
        System.out.println("Draw icon for android");
    }
}
