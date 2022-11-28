package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.visitor;

public class Wheel implements Car {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
