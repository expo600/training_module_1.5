package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.visitor;

public class Engine implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
