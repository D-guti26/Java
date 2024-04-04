package Pokemon;

public class Charmeleon extends Charmander {

  Charmeleon(){
    name = "Charmeleon";
    System.out.println("Charmander evolved into a " + name + "!");
    // super.battleCry();
  }
  // @Override
  void battleCry(){
    System.out.println(name + " says: GRR GRR!");
  }

  // @Override
  // public String toString() {
    
  //   return name + " says: grrr";
  // }
}
