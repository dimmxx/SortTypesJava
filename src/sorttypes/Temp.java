package sorttypes;

import java.util.Arrays;

public class Temp {

    static int[] array = {8, 7, 9, 1};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(split(array)));
    }

    public static int[] split(int[] array) {
        int len = array.length;
        if (len < 2) {
            return array;
        }
        int middle = len / 2;

        return mergeSort(split(Arrays.copyOfRange(array, 0, middle)),
                split(Arrays.copyOfRange(array, middle, len)));
    }


    public static int[] mergeSort (int[] array1, int[] array2){

        int[] arrayRes = new int[array1.length + array2.length];
        int pointer1 = 0;
        int pointer2 = 0;

        for (int i = 0; i < arrayRes.length; i++){

            if (array1[pointer1] < array2[pointer2]){
                arrayRes[i] = array1[pointer1];
                pointer1++;
                if(pointer1 == array1.length){
                    for(int k = i + 1; k < arrayRes.length; k++){
                        arrayRes[k] = array2[pointer2];
                        pointer2++;
                    }
                break;
                }
            } else {
                arrayRes[i] = array2[pointer2];
                pointer2++;
                if(pointer2 == array2.length){
                    for(int k = i + 1; k < arrayRes.length; k++){
                        arrayRes[k] = array1[pointer1];
                        pointer1++;
                    }
                break;
                }
            }
        }
        System.out.println(Arrays.toString(arrayRes));
        return arrayRes;
    }
}