package sorttypes;

public class demoSort {

    public static int [] intArrayOrigin = new int[GenerateArray.getSIZE()];

    public static void main(String[] args) {

            intArrayOrigin = GenerateArray.generateIntArray();

            StupidSort stupidSortItem = StupidSort.stupidSort();
            stupidSortItem.printOut();

            GnomeSort gnomeSortItem = GnomeSort.gnomeSort();
            gnomeSortItem.printOut();

            BubbleSort bubbleSortItem = BubbleSort.bubbleSort();
            bubbleSortItem.printOut();

            ShakerSort shakerSortItem = ShakerSort.shakerSort();
            shakerSortItem.printOut();


    }



}
