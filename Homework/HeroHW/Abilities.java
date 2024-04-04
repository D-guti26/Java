

public class Abilities {

  private String name;
  private int damage;
  private boolean miss;
  private String type;

  
Abilities(int damage, String name, boolean miss, String type) {
  this.setDamage(damage);
  this.setName(name);
  this.setMiss(miss);
  this.setType(type);
}

public int getDamage(){
  return damage;
}

public void setDamage(int damage) {
  this.damage = damage;
}

public String getName() {
  return name;
}

public void setName(String name){
  this.name = name;
}

public boolean getMiss(){
  return miss;
}

public void setMiss(boolean miss){
  this.miss = miss;
}

public String getType(){
  return type;
}

public void setType(String type) {
  this.type = type;
}

}
