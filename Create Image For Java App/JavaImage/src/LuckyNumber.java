import java.util.Random;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 10
        int luckyNumber = random.nextInt(10) + 1;

        System.out.println("Welcome to the Iftikhar Lucky Number Game!");
        System.out.println("Guess a number between 1 and 10:");

        try {
            // Read user input
            int userGuess = scanner.nextInt();

            // Check if the guess is correct
            if (userGuess == luckyNumber) {
                System.out.println("Congratulations! You guessed the lucky number: " + luckyNumber);
            } else {
                System.out.println("Sorry, the lucky number was: " + luckyNumber);
            }
        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Invalid input! Please enter a valid number between 1 and 10.");
        } finally {
            // Close the scanner
            scanner.close();
            System.out.println("Thanks for playing the Lucky Number Game!");
        }
    }
}
