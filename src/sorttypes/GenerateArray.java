package sorttypes;
import java.util.Random;

public class GenerateArray {

    private static char[] charBase = {' ', '!', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'};


    private static final int SIZE = 100;
    private static final int WORDLENGTH = 10;

    private static int[] intArray = new int[SIZE];
    private static double[] doubleArray = new double[SIZE];
    private static String[] stringArray = new String[SIZE];

    private static Random random = new Random();





    public static void main(String[] args) {



        char[] temp = new char[WORDLENGTH];

        for(int i = 0; i < SIZE; i++){



            for(int k = 0; k < WORDLENGTH; k++){

                stringArray[i][k] =;

            }

        }





    }




}
