import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");
        
        int numberOfGuesses = 0;
        int userGuess;
        
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfGuesses++;
            
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + numberOfGuesses + " guesses.");
            }
        } while (userGuess != randomNumber);
        
        scanner.close();
    }
}
