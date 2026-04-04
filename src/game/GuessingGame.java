package game;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    private final Scanner userInput;
    private final Random randomizer;
    private int secretNumber;
    private int remainingAttempts;
    private String playerName;

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 20;
    private static final int MAX_ATTEMPTS = 3;

    // CONSTRUCTOR
    public GuessingGame() {
        this.userInput = new Scanner(System.in);
        this.randomizer = new Random();
        this.secretNumber = randomizer.nextInt(MAX_NUMBER - MIN_NUMBER +1) + MIN_NUMBER;
        this.remainingAttempts = MAX_ATTEMPTS;
        this.playerName = "";
    }

    public void playGame() {
        // the loop and number of attempts
        setUpPlayer();
        do {
            boolean userWins = false;
            while (remainingAttempts > 0) {
                int guess = askForNumber();
                if (guess == secretNumber) {
                    userWins = true;
                    break;
                } else {
                    remainingAttempts--;
                    if (remainingAttempts > 0) {
                        compareGuess(guess);
                        System.out.println("Remaining attempts: " + remainingAttempts);
                    }
                }
            }
            displayResults(userWins);
            remainingAttempts = MAX_ATTEMPTS;
            secretNumber = randomizer.nextInt(MAX_NUMBER - MIN_NUMBER +1) + MIN_NUMBER;
        } while (askToReplay());
        userInput.close();
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

    public void compareGuess(int userGuess) {
        // prints hints
        if (userGuess > secretNumber) {
            System.out.println("Oops! It's lower.");
        }
        else if (userGuess < secretNumber){
            System.out.println("Oops! It's higher.");
        }
    }

    public void displayResults(boolean won) {
        if (won) {
            System.out.println("Congratulations, " + playerName + "! You win.");
        } else {
            System.out.println("Sorry! The secret number was: " + secretNumber + "\nBetter luck next time!");
        }
    }

    public boolean askToReplay () {
        userInput.nextLine();

        char play = 'y';
        char stop = 'n';
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Would you like to play again?\n'y' = Yes, 'n' = No");
            String replay = userInput.nextLine().toLowerCase();

            if (replay.isEmpty()) {
                System.out.println("ERROR! Please enter either 'y' or 'n'");
            } else if (replay.charAt(0) != play && replay.charAt(0) != stop) {
                System.out.println("ERROR! Please enter either 'y' or 'n' only");
            } else if (replay.charAt(0) == play) {
                System.out.println("Here we go again!");
                return playAgain;
            } else if (replay.charAt(0) == stop) {
                System.out.println("Thank you for playing!\n=== End of the Game ===");
                playAgain = false;
            }
        }
        return playAgain;
    }
}