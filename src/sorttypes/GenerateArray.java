package sorttypes;
import java.util.Random;

public class GenerateArray {

    private static int SIZE = 1000;

    private static int[] intArray = new int[SIZE];

    private static Random random = new Random();

    public static int getSIZE() { return SIZE; }
    public static void setSIZE(int size){SIZE = size;}




    public static int[] generateIntArray() {
        for(int i = 0; i<SIZE;i++) { intArray[i] = random.nextInt(SIZE + 1);}
        return intArray;
    }
}
