package sorttypes;
import java.util.Arrays;

public class demoSort {

    public static final int [] intArrayOrigin = GenerateArray.generateIntArray();


    public static void main(String[] args) {

        StupidSort stupidSortItem = StupidSort.stupidSort();
        stupidSortItem.printOut();

        BubbleSort bubbleSortItem = BubbleSort.bubbleSort();
        bubbleSortItem.printOut();

        ShakerSort shakerSortItem = ShakerSort.shakerSort();
        shakerSortItem.printOut();







    }



}
