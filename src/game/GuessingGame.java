package game;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    private Scanner userInput;
    private Random randomizer;
    private int secretNumer;
    private int remainingAttempts;
    private String playerName;

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 20;
    private static final int MAX_ATTEMPTS = 3;

    // CONSTRUCTOR
    public GuessingGame() {
        this.userInput = new Scanner(System.in);
        this.randomizer = new Random();
        this.secretNumer = randomizer.nextInt(MAX_NUMBER - MIN_NUMBER +1) + MIN_NUMBER;
        this.remainingAttempts = MAX_ATTEMPTS;
        this.playerName = "";
    }

    public void playGame() {
        // the loop and number of attempts
        setUpPlayer();
        boolean userWins = false;
        while (remainingAttempts > 0) {
            int guess = askForNumber();
            if (compareGuess(guess)) {
                userWins = true;
                break;
            } else {
                remainingAttempts--;
                System.out.println("Remaining attempts: " + remainingAttempts);
            }
        }
        displayResults(userWins);
        userInput.close();
        System.out.println("--- End of the game ---");
    }

    public void setUpPlayer() {
        System.out.println("Welcome! What's your name?");
        playerName = userInput.nextLine();
        System.out.println("Well, " + playerName + ". The rules are simple: \n" +
                "There is a secret number between " + MIN_NUMBER + " and " + MAX_NUMBER + ". You should guess it.\n" +
                "You will have " + MAX_ATTEMPTS + " chances and some hints will be provided.\n" +
                "The secret number is ready! Here we go!");
    }

    public int askForNumber() {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Now, please, enter your guess:");
                number = userInput.nextInt();
                if (number < MIN_NUMBER || number > MAX_NUMBER) {
                    System.out.println("ERROR: The number " + number + " is out of range.\n" +
                            "Remember that you must enter a number between " +MIN_NUMBER + " and " + MAX_NUMBER);
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                String wrongInput = userInput.next();
                System.out.println("ERROR: '" + wrongInput + "' is not an integer!");
            }
        }
        return number;
    }

    public boolean compareGuess(int userGuess) {
        // prints hints
        if (userGuess > secretNumer) {
            System.out.println("Oops! It's lower.");
        }
        else if (userGuess < secretNumer){
            System.out.println("Oops! It's higher.");
        }
        // compares the user's guess to the secret number
        return userGuess == secretNumer;
    }

    public void displayResults(boolean won) {
        if (won) {
            System.out.println("Congratulations, " + playerName + "! You win.");
        } else {
            System.out.println("Sorry! The secret number was: " + secretNumer + "\nBetter luck next time!");
        }
    }
}