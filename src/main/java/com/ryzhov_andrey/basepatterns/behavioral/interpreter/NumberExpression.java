package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.interpreter;

public class NumberExpression implements Expression {

    private String name;

    public NumberExpression(String name) {
        this.name = name;
    }

    @Override
    public double interpret(Context context) {
        return context.getVariable(name);
    }
}
