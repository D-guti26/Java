// Daniel Gutierrez
import java.util.Scanner;  // Import the Scanner class from java.util package in order to use it in the program

public class GreetUser {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Initializing Scanner in order to recieve/read input from the user below

    System.out.println("What's your name?"); // Prompt user with a question
    String name = scanner.nextLine(); // Here we call the nextLine() method of the scanner to intake a string from the user

    // Here we change the name variable (the user input) to upper case using the .toUpperCase method and greet the user.
    System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you!");

    scanner.close(); // Close the scanner object or it will give a yellow squigly error line stating there is a "Resource leak: 'scanner is never closed"

  }
}
