package sorttypes;

import java.util.Arrays;

public class MergeSort {

    private String name = "MergeSort";
    private int[] array;
    private long timeConsumedMillis;

    public MergeSort(int[] array, long timeConsumedMillis) {
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray() {
        return array;
    }

    public long getTimeConsumedMillis() {
        return timeConsumedMillis;
    }


    public static MergeSort mergeSort() {
        int[] array = CloneArray.cloneArray();
        long start = System.currentTimeMillis();

//----------------------------------------------------------------------------------------------

        split(array);





//------------------------------------------------------------------------------------------------
        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;
        return new MergeSort(array, timeConsumedMillis);
    }

    public void printOut() {
        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(DemoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
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
        //System.out.println(Arrays.toString(arrayRes));
        return arrayRes;
    }
}
