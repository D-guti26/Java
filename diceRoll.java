// Daniel Gutierrez
public class diceRoll {
  public static void main(String[] args) {

    //The Math.random() method generates a decimal, the int cast converts the decimal into a whole number which is what we want when working with dice. Here the method Math.random() generates a number 1-6, simulating a die roll. The + 1 makes the 6 inclusive.
    int dice1 = (int)(Math.random() * 6) + 1;

  
    int dice2 = (int)(Math.random() * 6) + 1;

    // Calculate the total roll by adding the two results from Math.Random() and storing it in the variable totalRoll
    int totalRoll = dice1 + dice2;

    // Here we call the println method to output to the terminal the results of the dice rolls and the total of the two
    System.out.println("Lucky first roll: " + dice1);
    System.out.println("Also lucky? Second roll: " + dice2);
    System.out.println("You can move " + totalRoll + " steps ahead!");

  }
}
