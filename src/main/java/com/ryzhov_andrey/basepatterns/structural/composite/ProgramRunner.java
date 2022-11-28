package src.main.java.com.ryzhov_andrey.basepatterns.structural.composite;

public class ProgramRunner {
    public static void main(String[] args) {
        ScalpersTeam team = new ScalpersTeam();

        Scalper fistScalper = new LongScalper();
        Scalper secondScalper = new ShortScalper();
        Scalper thirdScalper = new SmartMoneyScalper();

        team.addScalper(fistScalper);
        team.addScalper(secondScalper);
        team.addScalper(thirdScalper);

        team.startTrading();
    }
}
