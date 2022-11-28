package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Double> variables;

    public Context() {
        variables = new HashMap<>();
    }

    public double getVariable(String name) {
        return variables.get(name);
    }

    public void setVariable(String name, double value) {
        variables.put(name, value);
    }
}
