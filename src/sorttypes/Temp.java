package sorttypes;

import java.util.Arrays;

public class Temp {

    static int[] array = {8, 9, 10, 2, 9};

    public static void main(String[] args) {



    }

    public static void split (int [] array){

        int left = 0;
        int right = array.length -1;

        if (right >= left){
            int mid = (right - left + 1) / 2;
            split(mergeSort(left, mid));
            split(mergeSort(mid + 1, right));

            //                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     split(mid + 1, right);
        }

        System.out.println();
    }

    public static int[] mergeSort (int left, int right){

        int mid = (right - left + 1) / 2;
        int[] array1 = new int[left + mid + 1];
        int[] array2 = new int[right - mid + 1];

        for(int i = 0; i < array1.length; i++) array1[i] = array[i];
        for (int i = 0; i < array2.length; i++) array2[i] = array[i + mid + 1];
        //System.out.println(Arrays.toString(array1));
        //System.out.println(Arrays.toString(array2));

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
        return arrayRes;
    }
}