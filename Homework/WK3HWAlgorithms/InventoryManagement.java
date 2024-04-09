// Daniel Gutierrez
import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManagement {
    public static ArrayList<Item> onyxiaHideBackPack = new ArrayList<Item>(); //Initializing ArrayList
    public static Scanner scanner = new Scanner(System.in); // Initializing Scanner
        public static void main(String[] args) {
                int choice;

            do { // do while and if else statement logic for CLI selection
                System.out.println("\n--- Inventory Management System ---");
                System.out.println("1. Add an Item");
                System.out.println("2. Display Inventory");
                System.out.println("3. Delete an Item");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt(); // Reads input from user
                scanner.nextLine(); // Consume newline

                if (choice == 1) { 
                    addItem();
                } else if (choice == 2) {
                    displayInventory();
                } else if (choice == 3) {
                    deleteItem();
                } else if (choice != 4) {
                    System.out.println("Invalid choice. Please enter 1-4");
                }
                } while (choice != 4); // keeps the menue open while selection is not 4
                System.out.println("Exiting...");
                }
                
        private static void addItem() { // Requests user enter item data and adds item to inventory
                System.out.print("Enter Item ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Item Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                for (Item item : onyxiaHideBackPack) { // iterates over each item in inventory
                    if (item.getId().equals(id)) { // checks if item id matches another in the inventory, if so it sets new item quantity
                        item.setQuantity(item.getQuantity() + quantity); // talk about the name
                        System.out.println("Updated existing item's quantity");
                        return;
                        } 
                    } onyxiaHideBackPack.add(new Item(id, name, quantity)); // if item is a new item, it creates a new item with item attributs user entered
                        System.out.println("Item added to inventory");
                }

        private static void displayInventory() { // display inventory method, checks if empty
                if (onyxiaHideBackPack.isEmpty()) { // checks if inventory is empty, else
                    System.out.println("Inventory is empty");
                } else {
                    for (Item item : onyxiaHideBackPack) {
                        System.out.println(item.toString()); // item override toString to accurately display item information
                    }
                }
                }

        private static void deleteItem() { // user enters the item id they want to delete
                System.out.print("Enter Item ID to delete: ");
                String id = scanner.nextLine();

                for (int i = 0; i < onyxiaHideBackPack.size(); i++) { // interates through the items, if an item is found with id entered, it is deleted from inventory
                    if (onyxiaHideBackPack.get(i).getId().equals(id)) { // array is accessed at index, id is retrieved, compares ids
                        onyxiaHideBackPack.remove(i);
                        System.out.println("Item removed");
                        return;
                    }
                }
                System.out.println("Item with ID " + id + " not found");
            }
        }


