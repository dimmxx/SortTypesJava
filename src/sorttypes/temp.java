package sorttypes;

import java.util.Arrays;

public class temp {

    static int[] array = {1, 8, 2, 7, 1, 2, 7};

    public static void main(String[] args) {

        int start = 0;
        int end = array.length - 1;



        rellocateQ(start, end);
    }

    public static void rellocateQ (int start, int end){

        if(end > start + 1){
            int pivot = (start + end) / 2;
            for (int i = start; i < pivot; i++) {
                if (array[i] > array[pivot]){
                    pivot = move(i, pivot);

                }

            }
        }

        System.out.println(Arrays.toString(array));





    }


    public static int move (int ndx, int pivot){
        int tempI = array[ndx];
        //array[pivot] = array[ndx];
        for (int i = ndx; i < pivot; i++) {
            array[i] = array[i + 1];
        }
        array[pivot] = tempI;
        pivot--;





        return pivot;

    }



}