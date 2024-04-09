// Daniel Gutierrez
package WK3HW;


public class Exercise{ // class with private variables
    private String exercise;
    private int reps; private int sets;


    public Exercise() {
    // default constructor
    }
    public Exercise(String exercise, int reps, int sets){ // non default contructor
    this.exercise = exercise; // setting variables to the constructor
    this.reps = reps;
    this.sets = sets;
    }
    public String getExercise(){ // setters and getters for the private variables
    return exercise;
    }
    public void setExercise(String exercise){
    this.exercise = exercise;
    }
    public int getReps(){
    return reps;
    }
    public void setRep(int reps){
    this.reps = reps;
    }
    public int getSets(){
    return sets;
    }
    public void setSets(int sets){
    this.sets = sets;
    }
    @Override
    public String toString() { // toString override to return something meaningful
    return "To reset device slam on ground\n";
    }
    public void motivationQuote(){ // void method
    System.out.println("Lightweight buddy!");
    }
    public boolean isStrong() {
    return true; // method to check if you're strong
    }
}