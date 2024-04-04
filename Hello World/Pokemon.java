public class Pokemon {
  // initializing the variables
  String name;
  int level;

  // constructor, must have the same name as the class
  Pokemon(){ // when a new pokemon object pokemon is created this method is    called and sets the new pokemon to to the variables initialized
    level = 1;
  }
  Pokemon(String pName, int pLevel) {

    name = pName;
    level = pLevel;

  }

  // attack method that can be called upon
  void attack() {
    System.out.println(name + " attack");
  }
}
