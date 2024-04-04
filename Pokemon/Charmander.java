package Pokemon;

public class Charmander extends Pokemon { // Extended subclass from Pokemon super class

  Charmander() { // No argument constructor
    name = "Charmander";
    System.out.println("It's a " + name + "!");
    }

  // Charmander(String name){ // non-default constructor with arguments
  //   this.name = name;
  //   System.out.println("It's a " + name + "!");
  // }
  @Override
    void battleCry(){  // Same name method being overriden
      System.out.println(name + " says: Char Char!");
    }
}
