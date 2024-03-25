// Daniel Gutierrez
import java.util.Scanner; // Import the Scanner class from java.util package in order to use it in the program

public class CountChange {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // Initializing Scanner in order to recieve/read input from the user below
    
    // Here we output a message to the user asking to enter change quantity. The input is stored in the corresponding variables via the int data type
    System.out.println("Please input only whole numbers.");

    System.out.println("How many quarters do you have? ");
    int quarters = scanner.nextInt();
    
    System.out.println("How many dimes do you have? ");
    int dimes = scanner.nextInt();
    
    System.out.println("How many nickels do you have? ");
    int nickels = scanner.nextInt();
    
    System.out.println("How many pennies do you have? ");
    int pennies = scanner.nextInt();
    
    // Variable total will hold the added sum of all change. Declared total as a double because the end result will contain decimal values we want to keep 
    double total = quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01;
    
    // Print the total amount in dollars using the String.format method on the total, only keeping the values two decimals after
    System.out.println("You have $" + String.format("%.2f", total));
    
    scanner.close(); // Close the scanner object or it will give a yellow squigly error line stating there is a "Resource leak: 'scanner is never closed"

  }

}
