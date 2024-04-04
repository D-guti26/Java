
public class Main{
  public static void main(String[] args) {

// // classname var = new classname() - create and initilize objects
// // assignment in java runs from right to left, java goes into the memory to allocate space to create the object and then sets it equal to the pokemon variable so if we want to access anything in the Pokemon class
    Pokemon p1 = new Pokemon("Eevee", 25);
    System.out.println(p1.level);
    p1.attack();
    // p1.name = "Pikachu"; // using the dot operator to access the variables attributes
    // p1.level = 0;
    // p1.color = "Yellow";
    // p1.attack = "Lighting Bolt!";

//     Pokemon p2 = new Pokemon(); // if we change p1 it does not effect p2 as they are their own variables, objects and variables are encapsulated withi their own methods
//     p2.name = "Gengar ";
//     p2.level = 10;
//     p2.color = "Purple ";
//     p2.attack = "Shadow Ball! ";
  // System.out.print(p1.level);



  // System.out.println(p1.name + " " + p1.level);
  // p1.attack();
  // p2.attack();

  }
}

