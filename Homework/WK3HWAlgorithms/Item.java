// Daniel Gutierrez
public class Item { // item class with private set variables
  private String id; private String name; 
  private int quantity;

    public Item(String id, String name, int quantity) { // non default constructor
      this.id = id;
      this.name = name;
      this.quantity = quantity;

    }
    public String getId() {  // setters and getters for private variables
      return id;
    }
    public void setId(String id) {
      this.id = id;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getQuantity() {
      return quantity;
    }
    public void setQuantity(int quantity) {
      this.quantity = quantity;
    }
    @Override
    public String toString() { // override to string to correctly output inventory
      
      return "Item: " + " ID: " + id + " Name: " + name + " Quantity:  " + quantity;
    }
}
