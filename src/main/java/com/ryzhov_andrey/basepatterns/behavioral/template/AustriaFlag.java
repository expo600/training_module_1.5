package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.template;

public class AustriaFlag extends AbstractFlag{
    @Override
    void drawUpperLevel() {
        System.out.println("Draw red line ...");
    }

    @Override
    void drawMiddleLevel() {
        System.out.println("Draw white line ...");
    }

    @Override
    void drawBottomLevel() {
        System.out.println("Draw red line ...");
    }
}
