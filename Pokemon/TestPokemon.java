package Pokemon;

public class TestPokemon { // Main where subclasses are initialized
  public static void main(String[] args) {

    Pokemon wildPokemon = new Pokemon(); // polymorphism - wildPokemon is intilized with attributes from Pokemon class
    wildPokemon.battleCry(); 

    System.out.println("+++++++++++++");

    Charmander charmander = new Charmander();
    charmander.battleCry(); // demonstrate method overriding

    // Charmander charmanderP = new Charmander("Spicy");
    // charmanderP.battleCry();

    System.out.println("+++++++++++++");

    Charmeleon charmeleon = new Charmeleon(); // 
    charmeleon.battleCry(); // overriden SAME NAME method from superclass

    System.out.println("+++++++++++++");

    // System.out.println(charmeleon);
    // System.out.println("+++++++++++++");

    // Charizard charizard = new Charizard();
    // charizard.battleCry();
  
  }
}
