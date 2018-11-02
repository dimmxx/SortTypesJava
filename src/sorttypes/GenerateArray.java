package sorttypes;
import java.util.Arrays;
import java.util.Random;

public class GenerateArray {

    private static char[] charBase = {' ', '!', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'};

    private static final int SIZE = 1000;
    private static final int WORDLENGTH = 10;

    private static int[] intArray = new int[SIZE];
    private static float[] floatArray = new float[SIZE];
    private static String[] stringArray = new String[SIZE];

    private static Random random = new Random();

    public static void main(String[] args) {

// generate string array ======================================================================================

        char[][] tempChar = new char[SIZE][WORDLENGTH];
        for(int i = 0; i < SIZE; i++){
            for(int k = 0; k < WORDLENGTH; k++){
                tempChar[i][k] = charBase[random.nextInt(charBase.length)];
            }
        }
        for (int i = 0; i < tempChar.length; i++){
            System.out.println(Arrays.toString(tempChar[i]));
        }
        for (int i = 0; i < SIZE; i++){
            stringArray[i] = new String(tempChar[i]);
        }
        System.out.println(Arrays.toString(stringArray));


// generate float array =======================================================================================

        for(int i = 0; i < SIZE; i++){
            
        }


    }




}
