package Pokemon;

public class Charizard extends Charmeleon{
  Charizard(){
    name = "Charizard";
    System.out.println("Charmeleon evolved into a " + name + "!");
  }
  void battleCry(){
    System.out.println(name + "says: RAWR RAWR!");
  }
  
}
