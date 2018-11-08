package sorttypes;
import java.util.Arrays;

public class demoSort {

    public static final int [] intArrayOrigin = GenerateArray.generateIntArray();


    public static void main(String[] args) {



        StupidSort stupidSortItem = StupidSort.stupidSort();
        PrintOutArray.printOutArray(stupidSortItem.getArray());
        System.out.println(stupidSortItem.getTimeConsumedMillis() + " ms" + "\n");

        BubbleSort bubbleSortItem = BubbleSort.bubbleSort();
        PrintOutArray.printOutArray(bubbleSortItem.getArray());
        System.out.println(bubbleSortItem.getTimeConsumedMillis() + " ms" + "\n");





    }



}
