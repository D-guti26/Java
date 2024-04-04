// Daniel Gutierrez

// Define my class hero and initializing variables set to private making them unaccesible from anywhere other than this class
public class Hero {
  private String name; 
  private int level;
  private Power power; // enum variable

  // Constructor for the Hero class that initializes the hero's properties with the given values
  // The 'this' keyword is used to refer to the current object's fields and methods
  Hero(String name, int level, Power power){
    this.setName(name);
    this.setLevel(level);
    this.setPower(power);

  }

  // getter method for the hero's name. allows reading the private 'name' field from outside this class
  public String getName(){
    return name;
  }

   // setter method for the hero's name, allows modifying the private 'name' field from outside this class.
  public void setName(String name){
    this.name = name;
  }

  // same as above for age
  public int getLevel(){
    return level;
  }

  // same as above for age
  public void setLevel(int level){
    this.level = level;
  }

  // same as above
  public Power getPower(){
    return power;
  }

  // same as above 
  public void setPower(Power power){
    this.power = power;
  }
  public void fight(){ // fight method to be called on hero to attack
    System.out.println(this.name + " used " + this.power + " power!");
  }
  @Override
  public String toString() {
    return ("For the Horde!!!");
  }
}
