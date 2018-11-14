package sorttypes;

public class demoSort {

    public static int [] intArrayOrigin = new int[GenerateArray.getSIZE()];

    public static void main(String[] args) {

        for(int i = 0; i < 1; i++) {

            intArrayOrigin = GenerateArray.generateIntArray();

            StupidSort stupidSortItem = StupidSort.stupidSort();
            stupidSortItem.printOut();

            GnomeSort gnomeSortItem = GnomeSort.gnomeSort();
            gnomeSortItem.printOut();

            BubbleSort bubbleSortItem = BubbleSort.bubbleSort();
            bubbleSortItem.printOut();

            CombSort combSortItem = CombSort.combSort();
            combSortItem.printOut();

            ShakerSort shakerSortItem = ShakerSort.shakerSort();
            shakerSortItem.printOut();

            InsertionSort insertionSortItem = InsertionSort.insertionSort();
            insertionSortItem.printOut();

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");

        }

    }



}
