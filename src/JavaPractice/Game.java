package JavaPractice;
import java.util.Scanner;

public class Game {
    // Method to get a random choice for the computer
    String computer() {
        String computerChoice = ""; // Initialize with an empty string
        int randomNum = (int) (Math.random() * 3) + 1; // Correct random number generation
        switch (randomNum) {
            case 1:
                computerChoice = "rock";
                break;
            case 2:
                computerChoice = "paper";
                break;
            case 3:
                computerChoice = "scissors";
                break;
        }
        return computerChoice;
    }

    // Method to get the user's input
    String getUserInput(Scanner input) { // Pass the Scanner object from main
        System.out.println("Enter rock, paper, or scissors: ");
        String userInput = input.nextLine();
        return userInput.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object in main
        Game obj1 = new Game();


        String userChoice = obj1.getUserInput(input); // Pass Scanner object to getUserInput method
        String computerChoice = obj1.computer();
        System.out.println("Computer Choice : " + computerChoice);

        if (computerChoice.equals(userChoice)) { // Corrected String Comparison using .equals()
            System.out.println("Draw");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

        input.close(); // Close the Scanner object at the end of the program
    }
}
