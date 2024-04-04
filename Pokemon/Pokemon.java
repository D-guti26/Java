package Pokemon;

public class Pokemon {  
  String name = "Generic Pokemon";

  Pokemon(){
      System.out.println("A wild " + name + " appears!");
    }

  // Pokemon(String name){
  //   this.name(name);
  // }

    void battleCry() {
      System.out.println(name + " says:...");
    }
}
