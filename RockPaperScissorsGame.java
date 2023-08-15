import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"rock", "paper", "scissors"};
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice: rock, paper, or scissors");
        
        String userChoice = scanner.nextLine().toLowerCase();
        
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
            return;
        }
        
        int computerChoiceIndex = random.nextInt(choices.length);
        String computerChoice = choices[computerChoiceIndex];
        
        System.out.println("Computer chose: " + computerChoice);
        System.out.println("You chose: " + userChoice);
        
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        
        scanner.close();
    }
}
