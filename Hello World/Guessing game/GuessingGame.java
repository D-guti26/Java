import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
      int randomNumb = (int)(Math.random() * 100) +1;
      System.out.println("Guess a number between 1 - 100");
      Scanner scanner = new Scanner(System.in);
     // int Guess = scanner.nextInt();
     // scanner.close();
     // boolean guessedCorrectly = false;
      int guess = -1;

      while(guess != randomNumb ){
        System.out.println("Enter your guess now: ");
        guess = scanner.nextInt();
      
      if (guess < randomNumb){
        System.out.println("Guess number was too low, try again");
      }
      if (guess > randomNumb){
        System.out.println("Guessed nuber was too high, try again");
      }
      // if (guess == randomNumb){
      //   System.out.println("You guess correctly! Good job.");
      // }
      
      }

      System.out.println("You guess correctly! Great job");
      scanner.close();
    }
}