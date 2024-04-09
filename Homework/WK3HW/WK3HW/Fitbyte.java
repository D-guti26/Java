// Daniel Gutierrez
package WK3HW;

public class Fitbyte { // class with x2 private
    private int age;
    private int restingHeartRate;
    double percentageOfMaximum;
    double maxHeartRate;

    public Fitbyte(){     // default constructor

    }
    public Fitbyte(int age, int restingHeartRate) { // non default contructor
        this.age = age;
        this.restingHeartRate = restingHeartRate; // setting variables to the constructor
    }
    public int getAge() { // setters and getters for the private variables
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getRestingHeartRate(){
        return restingHeartRate;
    }
    public void setRestingHeartRate(int restingHeartRate){
        this.restingHeartRate = restingHeartRate;
    }
    public double targetHeartRate(double percentageOfMaximum) { // heart rate calculation provided
        double maxHeartRate = 206.3 - (0.711 * age);
        double targetHeartRate = (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
        return targetHeartRate;
    }

    public void Help(){
        System.out.println("For assistance please visit www.Fitbyte.com");
    }
}
