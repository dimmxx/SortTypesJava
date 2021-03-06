package sorttypes;

import java.util.Arrays;

public class DemoSort {

    public static int [] intArrayOrigin = new int[GenerateArray.getSIZE()];

    private final static int RUNS = 10;

    private static long[] summaryStupid = new long[RUNS];
    private static long[] summaryGnome = new long[RUNS];
    private static long[] summaryBubble = new long[RUNS];
    private static long[] summaryBubbleMod = new long[RUNS];
    private static long[] summaryComb = new long[RUNS];
    private static long[] summaryShaker = new long[RUNS];
    private static long[] summaryInsertion = new long[RUNS];
    private static long[] summarySelection = new long[RUNS];
    private static long[] summaryShell = new long[RUNS];
    private static long[] summaryQuick = new long[RUNS];
    private static long[] summaryMerge = new long[RUNS];

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
            BubbleSortMod bubbleSortModItem = BubbleSortMod.bubbleSortMod();
            summaryBubbleMod[i] = bubbleSortModItem.getTimeConsumedMillis();
            bubbleSortModItem.printOut();
            //#5
            CombSort combSortItem = CombSort.combSort();
            summaryComb[i] = combSortItem.getTimeConsumedMillis();
            combSortItem.printOut();
            //#6
            ShakerSort shakerSortItem = ShakerSort.shakerSort();
            summaryShaker[i] = shakerSortItem.getTimeConsumedMillis();
            shakerSortItem.printOut();
            //#7
            InsertionSort insertionSortItem = InsertionSort.insertionSort();
            summaryInsertion[i] = insertionSortItem.getTimeConsumedMillis();
            insertionSortItem.printOut();
            //#8
            SelectionSort selectionSortItem = SelectionSort.selectionSort();
            summarySelection[i] = selectionSortItem.getTimeConsumedMillis();
            selectionSortItem.printOut();
            //#9
            ShellSort shellSortItem = ShellSort.shellSort();
            summaryShell[i] = shellSortItem.getTimeConsumedMillis();
            shellSortItem.printOut();
            //#10
            QuickSort quickSortItem = QuickSort.quickSort();
            summaryQuick[i] = quickSortItem.getTimeConsumedMillis();
            quickSortItem.printOut();
            //#11
            MergeSort mergeSortItem = MergeSort.mergeSort();
            summaryMerge[i] = mergeSortItem.getTimeConsumedMillis();
            mergeSortItem.printOut();

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        printSummary();

    }

    private static void printSummary(){
        System.out.println("Stupid Sort:        " + Arrays.toString(summaryStupid)
               + " Average time: " + averageTimeConsumed(summaryStupid) / summaryStupid.length + " ms");
        System.out.println("Gnome Sort:         " + Arrays.toString(summaryGnome)
               + " Average time: " + averageTimeConsumed(summaryGnome) / summaryGnome.length + " ms");
        System.out.println("Bubble Sort:        " + Arrays.toString(summaryBubble)
               + " Average time: " + averageTimeConsumed(summaryBubble) / summaryBubble.length + " ms");
        System.out.println("Bubble Sort Mod:    " + Arrays.toString(summaryBubbleMod)
               + " Average time: " + averageTimeConsumed(summaryBubbleMod) / summaryBubbleMod.length + " ms");
        System.out.println("Comb Sort:          " + Arrays.toString(summaryComb)
               + " Average time: " + averageTimeConsumed(summaryComb) / summaryComb.length + " ms" );
        System.out.println("Shaker Sort:        " + Arrays.toString(summaryShaker)
               + " Average time: " + averageTimeConsumed(summaryShaker) / summaryShaker.length + " ms");
        System.out.println("Insertion Sort:     " + Arrays.toString(summaryInsertion)
               + " Average time: " + averageTimeConsumed(summaryInsertion) / summaryInsertion.length + " ms");
        System.out.println("Selection Sort:     " + Arrays.toString(summarySelection)
               + " Average time: " + averageTimeConsumed(summarySelection) / summarySelection.length + " ms");
        System.out.println("Shell Sort:         " + Arrays.toString(summaryShell)
               + " Average time: " + averageTimeConsumed(summaryShell) / summaryShell.length + " ms");
        System.out.println("Quick Sort:         " + Arrays.toString(summaryQuick)
               + " Average time: " + averageTimeConsumed(summaryQuick) / summaryQuick.length + " ms");
        System.out.println("Merge Sort:         " + Arrays.toString(summaryMerge)
               + " Average time: " + averageTimeConsumed(summaryMerge) / summaryMerge.length + " ms");


    }

    private static float averageTimeConsumed (long summaryArray[]){
        float average = 0;
        for (int i = 0; i < summaryArray.length; i++){
            average += summaryArray[i];
        }
        return average;
    }
}
