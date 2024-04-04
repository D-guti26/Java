package WK3HW;
enum ExerciseOfTheWeek{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};

public class HealthApp {
  public static void main(String[] args) {
    
    Exercise Monday = new Exercise(
      ExerciseOfTheWeek.MONDAY, 
      "Push Day:\n" + 
      "Chest Press Machine\n" +
      "Cable Flys\n" + 
      "Squats\n", 
      20, 
      5);
  
    Exercise Wednesday = new Exercise(
      ExerciseOfTheWeek.WEDNESDAY, 
      "Pull Day" + 
      "Lat Pull Downs" +
      "Back Flys" + 
      "Deadlifts", 
      20, 
      5);

      System.out.println(Monday);
      // Fitbyte fitbyte = new Fitbyte(33, 75);
      // double targetHeartRate = fitbyte.TargetHeartRate(.50);
      // System.out.println("Target Heart Rate " + Math.round(targetHeartRate) + " bmp.");
      System.out.println(Monday.getExercise());
      Monday.getReps();
      Monday.motivationQuote();

  }
}
