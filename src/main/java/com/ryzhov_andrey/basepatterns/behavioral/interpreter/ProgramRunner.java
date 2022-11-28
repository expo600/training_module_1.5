package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.interpreter;

public class ProgramRunner {
    public static void main(String[] args) {
        Context context = new Context();

        int x = 2;
        int y = 2;
        int z = 4;

        context.setVariable("x", x);
        context.setVariable("y", y);
        context.setVariable("z", z);

        Expression expression = new DivExpression(new MultiplyExpression(new NumberExpression("x"),
                new NumberExpression("y")),
                new NumberExpression("z")
        );

        double result = expression.interpret(context);
        System.out.println("result: " + result);
    }
}


