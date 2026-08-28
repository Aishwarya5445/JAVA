import java.util.Random;
public class Random_class 
{
    public static void main(String[] args) {
    Random rand = new Random();
    int randomInt = rand.nextInt(); // any int
    int randomBounded = rand.nextInt(100); // 0 to 99
    double randomDouble = rand.nextDouble(); // 0.0 to 1.0
    boolean randomBool = rand.nextBoolean(); // true/false
    System.out.println("Random Int: " + randomInt);
    System.out.println("Random Int (0-99): " + randomBounded);
    System.out.println("Random Double: " + randomDouble);
    System.out.println("Random Boolean: " + randomBool);
    }
}