package game;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    private Scanner userInput;
    private Random randomizer;
    private int secretNumer;
    private int remainingAttempts;
    private String playerName;

    private static final int MAX_ATTEMPTS = 3;

    // CONSTRUCTOR
    public GuessingGame() {
        this.userInput = new Scanner(System.in);
        this.randomizer = new Random();
        this.secretNumer = randomizer.nextInt(100) + 1;
        this.remainingAttempts = MAX_ATTEMPTS;
        this.playerName = "";
    }
    public void playGame() {
        // the loop and number of attempts go here
        setUpPlayer();
    }
    public void setUpPlayer() {
        // greets and gets user's name
    }
    public int askForNumber() {
        // asks and reads the scanner
        return 0; // temporary
    }
    public boolean compareGuess(int userGuess) {
        // compares the user's guess to the secret number
        // returns true if correct or false if not
        // prints hints
        return true; // temporary
    }
    public void displayResults(boolean won) {
        
    }
}