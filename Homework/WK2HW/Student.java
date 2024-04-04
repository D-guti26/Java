
// Daniel Gutierrez
public class Student {
    private String name; // Variables initialized
    private double GPA;
    
    public Student(String name, double GPA) {  // Constructor initializes a Student object with declared name and GPA parameters
        this.name = name; // Assign the value of the parameter name to the instance variable name
        this.GPA = GPA;
    }
    public String getName() { // Method returns name of object as a string
        return this.name;
        }
    public double getGpa() { // Method returns GPA of object as a double
    return this.GPA;
    }
    @Override
    public String toString() { // Method returns a string with relevant useful information about the object
        return ("Student - " + this.name + " - GPA - " + this.GPA);
        }
    }
