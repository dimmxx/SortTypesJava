package sorttypes;

import java.util.Arrays;

public class Temp {

    static int[] array = {1, 2};
    static int[] array1 = {3, 4};



    public static void main(String[] args) {

        System.out.println(mergeSort(array, array1));

    }

    public static int[] mergeSort (int[] array1, int[] array2){

        int[] arrayRes = new int[array1.length + array2.length];
        int pointer1 = 0;
        int pointer2 = 0;


        for (int i = 0; i < arrayRes.length; i++){

            if (array1[pointer1] < array2[pointer2]){
                arrayRes[i] = array1[pointer1];
                pointer1++;
            } else {
                arrayRes[i] = array2[pointer2];
                pointer2++;
            }



        }


        return arrayRes;
    }


}