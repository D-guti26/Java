import java.util.Random;
// my randomgenerator class
public class RandomGenerator {
    // Random random = new Random();
    // int x = random.nextInt(6) + 1;
    // double y = random.nextDouble();
    // boolean z = random.nextBoolean();
    // System.out.println(x);
    // System.out.println(y);
    // System.out.println(z);
  /**
   * 
   * @param <T>
   * @param Nature
   * @return
   */
  public static <T extends Enum<?>> T RandomEnumNat(Class<T> Nature){
    Random random = new Random();
    T[] enumConstants = Nature.getEnumConstants();
    int randomIndex = random.nextInt(enumConstants.length);
    return enumConstants[randomIndex];
  }
  public static <T extends Enum<?>> T RandomEnumChar1(Class<T> Characteristics){
    T[] enumConstants = Characteristics.getEnumConstants();
    Random random = new Random();
    int randomIndex = random.nextInt(enumConstants.length);
    return enumConstants[randomIndex];


}
}