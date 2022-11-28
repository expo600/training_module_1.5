package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Android;

import src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory.Button;

public class AndroidButton implements Button {
    @Override
    public void draw() {
        System.out.println("Draw button for android");
    }
}
