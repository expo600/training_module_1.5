package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Iphone;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Button;

public class IphoneButton implements Button {
    @Override
    public void draw() {
        System.out.println("Draw button for iphone");
    }
}
