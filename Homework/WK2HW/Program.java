import java.util.Scanner; // Import Scanner to read input
// Daniel Gutierrez
// Main class where magic happens
public class Program {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); // New Scanner object instantiated
      System.out.println("Enter a number to select a sorting method:\n" + // User prompt to select a number
      "\n1. BubbleSort" + 
      "\n2. SelectionSort" + 
      "\n3. QuickSort");
      int selection = scanner.nextInt(); // Accessing the Scanner's netInt() method with dot notation to recieve user input
      Student s1 = new Student("Daniel", 3.5); // Instantiating the five students with string and double values
      Student s2 = new Student("Adam", 4.0);
      Student s3 = new Student("Alejandra", 3.9);
      Student s4 = new Student("Yensy", 3.8);
      Student s5 = new Student("Diego", 3.7);
      Student[] StuArray = {s1, s2, s3, s4, s5}; // Instantiating the student array with objects created above
      
      
      if (selection == 1) { // If else statement logic to select a sorting method
        DescendingSort.BubbleSort(StuArray); // Call to static BubbleSort method 
        System.out.println("You selected BubbleSort:\n"); // If condition check passes, print user selection, \n spaces print statements
        for (int i = 0; i < StuArray.length; i++) { // Initializing for loop to iterate through the array 
          Student student = StuArray[i]; // Student serves as a temp hold spot as the for loops through each index
            System.out.println(student); // Call to student.toString() method for each student
          }
        } else if (selection == 2){
        DescendingSort.SelectionSort(StuArray);
        System.out.println("You selected SelectionSort:\n");
        for (int i = 0; i < StuArray.length; i++) {
          Student student = StuArray[i]; 
            System.out.println(student.toString());
        }
      } else if (selection == 3) {
        DescendingSort.QuickSort(StuArray);
        System.out.println("You selected QuickSort:\n");
        for (int i = 0; i < StuArray.length; i++) {
          Student student = StuArray[i];
            System.out.println(student);
      }
    } else { // Else handles any inout not recognized by the if else statements
      System.out.println("Please try again"); // Try again prompt to user
      }
      scanner.close(); // close the scanner 
    }
  }
