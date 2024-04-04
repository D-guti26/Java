import java.util.Scanner;

public class Classwrk {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a value: ");
      int userInput = scanner.nextInt();
      
      
      if (userInput >= 0) {
        System.out.println(Math.sqrt(userInput));
      } else {
        System.out.println("Error");
        scanner.close();

      }

  }
}
