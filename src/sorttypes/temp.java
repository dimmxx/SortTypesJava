package sorttypes;

import java.util.Arrays;

public class temp {

    static int[] array = {7, 5, 1, 3, 2, 9, 1};

    public static void main(String[] args) {

    }

    public static int[] mergeSort (int[] array1, int[] array2){

        int[] arrayRes = new int[array1.length + array2.length];
        for (int i = 0; i < arrayRes.length; i++){
            if (array1[i] <= array2[i]){
                arrayRes[i] = array1[i];
                
            }
        }







        return arrayRes;
    }


}