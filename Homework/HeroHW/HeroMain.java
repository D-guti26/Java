// Daniel Gutierrez
// HeroMain class that will invoke the hero java methods

public class HeroMain {

// the main method, serving as the entry point of the java application

public static void main(String[] args) { 

    // a non-default instance of the hero class we created in the hero.java file
    // initialize Hero1 (new Hero object) with constructor parameters, then modify attributes using setter methods and access them for output
    Hero Hero1 = new Hero("Daniel", 33, Power.TELEPORTATION);
    Hero1.setLevel(34);
    Hero1.fight();
    Hero1.setPower(Power.FIRE);
    Hero1.setName("Monkey");
    System.out.println(Hero1.getName());
    System.out.println(Hero1.getLevel());
    System.out.println(Hero1.getPower());
    System.out.println(Hero1.toString());

    // Same as above
    Hero Hero2 = new Hero("Adam", 11, Power.FIRE);
    Hero2.setLevel(12);
    Hero2.fight();
    Hero2.setName("Son");
    Hero2.setPower(Power.EARTH);
    Hero2.setPower(Power.FIRE);
    System.out.println(Hero2.getName());
    System.out.println(Hero2.getLevel());
    System.out.println(Hero2.getPower());
  }
}
