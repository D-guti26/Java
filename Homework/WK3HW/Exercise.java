package WK3HW;

public class Exercise{
  private String exercise;
  private int reps; int sets; int rest;

  public Exercise(ExerciseOfTheWeek day, String exercise, int reps, int sets){
      this.setExercise(exercise);
      this.setRep(reps);
      this.setSets(sets);
    }

    public String getExercise(){
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
    public String toString() {
    
      return "Don't forget to check your heart rate!";
    }
    public void motivationQuote(){
      System.out.println("Lightweight buddy!");
    }
}