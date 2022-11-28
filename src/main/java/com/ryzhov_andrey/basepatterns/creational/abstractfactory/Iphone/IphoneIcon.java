package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Iphone;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Icon;

public class IphoneIcon implements Icon {
    @Override
    public void draw() {
        System.out.println("Draw icon for iphone");
    }
}
