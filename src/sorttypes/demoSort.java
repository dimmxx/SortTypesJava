package sorttypes;
import java.util.Arrays;

public class demoSort {

    public static final int [] intArrayOrigin = GenerateArray.generateIntArray();


    public static void main(String[] args) {

        bubbleSort();

        StupidSort stupidSort = StupidSort.stupidSort();
        PrintOutArray.printOutArray(stupidSort.getArray());
        System.out.println(stupidSort.getTimeConsumedMillis());




    }

    public static void bubbleSort(){
        int[] cloneArray = CloneArray.cloneArray();
        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(cloneArray);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("Bubble sort: ");
        PrintOutArray.printOutArray(intArrayOrigin);
        PrintOutArray.printOutArray(cloneArray);
        System.out.println("Time elapsed: " + timeConsumedMillis + " ms");
    }




}
