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

            SelectionSort selectionSortItem = SelectionSort.selectionSort();
            selectionSortItem.printOut();

            ShellSort shellSortItem = ShellSort.shellSort();
            shakerSortItem.printOut();

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");

        }

    }

    private void printSummary(){
        System.out.println();



    }


}
