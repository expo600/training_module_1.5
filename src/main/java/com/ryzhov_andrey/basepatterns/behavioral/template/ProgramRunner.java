package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.template;

public class ProgramRunner {
    public static void main(String[] args) {

        System.out.println("Draw the flag of Germany ...");
        AbstractFlag germanyFlag = new GermanyFlag();
        germanyFlag.drawFlag();

        System.out.println("==============================================");

        System.out.println("Draw the flag of Austria ...");
        AbstractFlag austriaFlag = new AustriaFlag();
        austriaFlag.drawFlag();
    }
}
