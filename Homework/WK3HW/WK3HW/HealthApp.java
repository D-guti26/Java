// Daniel Gutierrez
package WK3HW;
import java.util.Scanner;
import java.util.ArrayList;

public class HealthApp {

    public static Scanner scanner = new Scanner(System.in); // Initializing Scanner
        public static void main(String[] args) {
            int choice;
            Exercise pushday = new Exercise("\nPush Day:\n" + "Chest Press Machine\n" +"Back Flys", 20, 5);
            Exercise pullday = new Exercise( "\nPull Day:\n" + "Lat Pull Downs\n" +"Cable Flys", 20, 5);
            Exercise legday = new Exercise("\nLegs:\n" + "Squats\n" + "Deadlifts\n" + "Lunges", 20, 5);
            ArrayList<Exercise> workout = new ArrayList<Exercise>();
            workout.add(pushday);
            workout.add(pullday);
            workout.add(legday);

            do {
            System.out.println("\nSelect a Workout Plan: ");
            System.out.println("1. Push Day");
            System.out.println("2. Pull Day");
            System.out.println("3. Legs");
            System.out.println("4. Fitbyte");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.println(pushday.getExercise());
                System.out.println("For " + pushday.getReps() + " Repetitions");
                System.out.println(pushday.getSets() + " sets each");
            } else if (choice == 2) {
                System.out.println(pullday.getExercise());
                System.out.println("For " + pullday.getReps() + " Repetitions");
                System.out.println(pullday.getSets() + " sets each");
            } else if (choice == 3){
                System.out.println(legday.getExercise());
                System.out.println("For " + legday.getReps() + " Repetitions");
                System.out.println(legday.getSets() + " sets each");
            } else if (choice == 4) {
                fitbyte();
            }
            } while (choice != 5);
            System.out.println("\nBye, have a good day!");
            }
            
            private static void fitbyte() { // fitbyte user interface method
            System.out.print("Enter your age: "); // user is prompted to enter data
            int age = scanner.nextInt();

            System.out.print("Enter your resting heart rate: ");
            int restingHeartRate = scanner.nextInt();

            System.out.print("Enter the desired intensity as a percentage (example - 50 for 50%): ");
            double percentageOfMaximum = scanner.nextDouble() / 100; // convert percentage to decimal 

            Fitbyte fitbyte = new Fitbyte(age, restingHeartRate); //
            double targetHeartRate = fitbyte.targetHeartRate(percentageOfMaximum);

            System.out.println("Your target heart rate at " + percentageOfMaximum * 100 + "% intensity is: " + Math.round(targetHeartRate) + " bpm.");
            scanner.nextLine(); // Consume newline left after reading the double
            }
} // create a user interface??
