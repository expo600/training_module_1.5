package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.memento;

public class ProgramRunner {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        FileToSave file = new FileToSave();

        System.out.println("Creating a new game ...");
        game.setLevelAndDate("1");
        System.out.println(game);

        Thread.sleep(5000);

        System.out.println("Up the second level ...");
        game.setLevelAndDate("2");

        System.out.println("Save the game ...");
        file.setSaveGame(game.saveGame());
        System.out.println(game);

        Thread.sleep(5000);

        System.out.println("Up the third level ...");
        game.setLevelAndDate("3");
        System.out.println(game);
        Thread.sleep(5000);

        System.out.println("We play hard and lose ...");
        System.out.println("Loading the save ...");
        game.loadGame(file.getSaveGame());
        System.out.println(game);
    }
}
