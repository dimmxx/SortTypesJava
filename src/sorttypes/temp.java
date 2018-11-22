package sorttypes;

import java.util.Arrays;

public class temp {

    static int[] array = {8, 7, 5, 3, 1, 3, 9, 4};

    public static void main(String[] args) {

        int startPos = 0;
        int endPos = array.length - 1;

        rellocateQ(startPos, endPos, array);
    }

    public static void rellocateQ (int startPos, int endPos, int[] array) {

        if (endPos > startPos + 1) {
            int pivot = (startPos + endPos) / 2;
            System.out.println("begin " + pivot);

            for (int i = startPos; i < pivot; i++) {
                if (array[i] > array[pivot]) {
                    pivot = moveLeft(i, pivot, array);
                    i--;
                    System.out.println("left " + pivot);
                }
            }

            for (int k = endPos; k > pivot; k--) {
                if (array[k] < array[pivot]) {
                    pivot = moveRight(k, pivot, array);
                    k++;
                    System.out.println("right " + pivot);
                }
            }


            int med = (startPos + endPos) / 2;

            rellocateQ(startPos, med, array);
            rellocateQ(med, endPos, array);
        }

    System.out.println(Arrays.toString(array));

    }

    public static int moveLeft (int ndx, int pivot, int[] array){
        int tempI = array[ndx];
        //array[pivot] = array[ndx];
        for (int i = ndx; i <= pivot; i++) {
            array[i] = array[i + 1];
        }
        array[pivot] = tempI;
        pivot--;
        return pivot;
    }

    public static int moveRight (int ndx, int pivot, int[] array){
        int tempI = array[ndx];
        //array[pivot] = array[ndx];
        for (int i = ndx; i > pivot; i--) {
            array[i] = array[i - 1];
        }
        array[pivot] = tempI;
        pivot++;
        return pivot;
    }
}