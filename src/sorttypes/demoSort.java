package sorttypes;

import java.util.Arrays;

public class demoSort {

    public static int [] intArrayOrigin = new int[GenerateArray.getSIZE()];

    private final static int RUNS = 5;

    private static long[] summaryStupid = new long[RUNS];
    private static long[] summaryGnome = new long[RUNS];
    private static long[] summaryBubble = new long[RUNS];
    private static long[] summaryComb = new long[RUNS];
    private static long[] summaryShaker = new long[RUNS];
    private static long[] summaryInsertion = new long[RUNS];
    private static long[] summarySelection = new long[RUNS];
    private static long[] summaryShell = new long[RUNS];

    public static void main(String[] args) {

        for(int i = 0; i < RUNS; i++) {

            intArrayOrigin = GenerateArray.generateIntArray();
            //#1
            StupidSort stupidSortItem = StupidSort.stupidSort();
            summaryStupid[i] = stupidSortItem.getTimeConsumedMillis();
            stupidSortItem.printOut();
            //#2
            GnomeSort gnomeSortItem = GnomeSort.gnomeSort();
            summaryGnome[i] = gnomeSortItem.getTimeConsumedMillis();
            gnomeSortItem.printOut();
            //#3
            BubbleSort bubbleSortItem = BubbleSort.bubbleSort();
            summaryBubble[i] = bubbleSortItem.getTimeConsumedMillis();
            bubbleSortItem.printOut();
            //#4
            CombSort combSortItem = CombSort.combSort();
            summaryComb[i] = combSortItem.getTimeConsumedMillis();
            combSortItem.printOut();
            //#5
            ShakerSort shakerSortItem = ShakerSort.shakerSort();
            summaryShaker[i] = shakerSortItem.getTimeConsumedMillis();
            shakerSortItem.printOut();
            //#6
            InsertionSort insertionSortItem = InsertionSort.insertionSort();
            summaryInsertion[i] = insertionSortItem.getTimeConsumedMillis();
            insertionSortItem.printOut();
            //#7
            SelectionSort selectionSortItem = SelectionSort.selectionSort();
            summarySelection[i] = selectionSortItem.getTimeConsumedMillis();
            selectionSortItem.printOut();
            //#8
            ShellSort shellSortItem = ShellSort.shellSort();
            summaryShell[i] = shellSortItem.getTimeConsumedMillis();
            shellSortItem.printOut();

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        printSummary();

    }

    private static void printSummary(){
        System.out.println("Stupid Sort:    " + Arrays.toString(summaryStupid)
               + " Average time: " + averageTimeConsumed(summaryStupid) / summaryStupid.length + " ms");
        System.out.println("Gnome Sort:     " + Arrays.toString(summaryGnome)
               + " Average time: " + averageTimeConsumed(summaryGnome) / summaryGnome.length + " ms");
        System.out.println("Bubble Sort:    " + Arrays.toString(summaryBubble)
               + " Average time: " + averageTimeConsumed(summaryBubble) / summaryBubble.length + " ms");
        System.out.println("Comb Sort:      " + Arrays.toString(summaryComb)
               + " Average time: " + averageTimeConsumed(summaryComb) / summaryComb.length + " ms" );
        System.out.println("Shaker Sort:    " + Arrays.toString(summaryShaker)
               + " Average time: " + averageTimeConsumed(summaryShaker) / summaryShaker.length + " ms");
        System.out.println("Insertion Sort: " + Arrays.toString(summaryInsertion)
               + " Average time: " + averageTimeConsumed(summaryInsertion) / summaryInsertion.length + " ms");
        System.out.println("Selection Sort: " + Arrays.toString(summarySelection)
               + " Average time: " + averageTimeConsumed(summarySelection) / summarySelection.length + " ms");
        System.out.println("Shell Sort:     " + Arrays.toString(summaryShell)
               + " Average time: " + averageTimeConsumed(summaryShell) / summaryShell.length + " ms");
    }

    private static float averageTimeConsumed (long summaryArray[]){
        float average = 0;
        for (int i = 0; i < summaryArray.length; i++){
            average += summaryArray[i];
        }
        return average;
    }
}
