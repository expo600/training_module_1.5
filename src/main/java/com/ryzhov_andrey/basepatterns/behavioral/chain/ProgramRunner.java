package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.chain;

public class ProgramRunner {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleNotice(Stages.TRADING);
        Notifier middleNotifier = new MiddleNotice(Stages.APPROACH_TO_LEVEL);
        Notifier importantNotifier = new ImportantNotice(Stages.LEVEL_BREAKOUT);

        simpleNotifier.setNextNotifier(middleNotifier);
        middleNotifier.setNextNotifier(importantNotifier);

        simpleNotifier.notifierTrader("follow the schedule ...",Stages.TRADING);
        System.out.println("============================================================");
        simpleNotifier.notifierTrader("ready to make a trade ...",Stages.APPROACH_TO_LEVEL);
        System.out.println("============================================================");
        simpleNotifier.notifierTrader("too late ...",Stages.LEVEL_BREAKOUT);
    }
}
