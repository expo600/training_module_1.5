package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.template;

public abstract class AbstractFlag {
    abstract void drawUpperLevel();

    abstract void drawMiddleLevel();

    abstract void drawBottomLevel();

    final void drawFlag() {
        drawUpperLevel();
        drawMiddleLevel();
        drawBottomLevel();
        drawFlagpole();
    }
    public void drawFlagpole(){
        System.out.println("Flagpole Drawn");
    }
}
