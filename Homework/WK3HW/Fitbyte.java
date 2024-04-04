package WK3HW;

public class Fitbyte {
  private int age;
  private int restingHeartRate;
  double percentageOfMaximum;
  double maxHeartRate;

  

  public Fitbyte(int age, int restingHeartRate) {
    this.setAge(age);
    this.setRestingHeartRate(restingHeartRate);
  }
  public int getAge() {
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
  public double TargetHeartRate(double percentageOfMaximum) {
    double maxHeartRate = 206.3 - (0.711 * age);
    double targetHeartRate = (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    return targetHeartRate;
  }
  }
