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
        
        askForNumber();
    }
    public void setUpPlayer() {
        System.out.println("Welcome! What's your name?");
        playerName = userInput.nextLine();
        System.out.println("Well, " + playerName + ". The rules are simple: \n" +
                "There is a secret number between 1 to 100 and you should guess it.\n" +
                "You will have " + MAX_ATTEMPTS + " chances and some hints will be provided.\n" +
                "Here we go!");
    }
    public int askForNumber() {
        System.out.println("The secret number is ready!\n" +
                "Now, please, enter your guess:");
        int userGuess = userInput.nextInt();
        return userGuess;
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