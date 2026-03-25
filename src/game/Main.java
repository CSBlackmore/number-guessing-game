package game;

public class Main {
    public static void main(String[] args) {
        System.out.println("Game starting...");
        GuessingGame game = new GuessingGame(); // Se llama al constructor
        game.playGame();
    }
}