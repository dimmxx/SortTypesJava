package sorttypes;
import java.util.Arrays;
import java.util.Random;


public class GenerateArray3 {

    private static char[] charBase = {' ', '!', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'};

    private static final int SIZE = 3;
    private static final int WORDLENGTH = 10;

    private static Integer[] intArray = new Integer[SIZE];
    private static Float[] floatArray = new Float[SIZE];
    private static String[] stringArray = new String[SIZE];

    private static Random random = new Random();

    public static int getSIZE() { return SIZE; }

    // generate string array ======================================================================================

    public static String[] generateStringArray() {
        char[][] tempChar = new char[SIZE][WORDLENGTH];
        for (int i = 0; i < SIZE; i++) {
            for (int k = 0; k < WORDLENGTH; k++) {
                tempChar[i][k] = charBase[random.nextInt(charBase.length)];
            }
        }

        for (int i = 0; i < SIZE; i++) {
            stringArray[i] = new String(tempChar[i]);
        }
        return stringArray;
    }

// generate float array =======================================================================================

    public static Float[] generateFloatArray() {
        for (int i = 0; i < SIZE; i++) {floatArray[i] = random.nextFloat() * SIZE;}
        return floatArray;
    }

// generate int array ==========================================================================================

    public static Integer[] generateIntArray() {
        for(int i = 0; i<SIZE;i++) { intArray[i] = random.nextInt(SIZE + 1);}
        return intArray;
    }
}

/*
public class CloneArray<T>{

     public T[] cloneArray (T[] array){

         T[] clone = (T[]) new Object[array.length];
         for(int i = 0; i < array.length; i++) clone[i] = array[i];




        return clone;
        }
*/