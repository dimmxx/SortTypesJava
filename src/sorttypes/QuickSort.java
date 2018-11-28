package sorttypes;

public class QuickSort {

    private String name = "QuickSort";
    private int[] array;
    private long timeConsumedMillis;

    public QuickSort(int[] array, long timeConsumedMillis) {
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray() {
        return array;
    }

    public long getTimeConsumedMillis() {
        return timeConsumedMillis;
    }


    public static QuickSort quickSort() {
        int[] array = CloneArray.cloneArray();
        long start = System.currentTimeMillis();

//----------------------------------------------------------------------------------------------

        int startPos = 0;
        int endPos = array.length - 1;

        rellocateQ(startPos, endPos, array);

//------------------------------------------------------------------------------------------------
        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;
        return new QuickSort(array, timeConsumedMillis);
    }

    public void printOut() {
        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(DemoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
    }

    public static void rellocateQ (int startPos, int endPos, int[] array) {

        if (endPos > startPos + 1) {
            int pivot = (startPos + endPos) / 2;
            //System.out.println("begin " + pivot);

            for (int i = startPos; i < pivot; i++) {
                if (array[i] > array[pivot]) {
                    pivot = moveLeft(i, pivot, array);
                    i--;
                    //System.out.println("left " + pivot);
                }
            }

            for (int k = endPos; k > pivot; k--) {
                if (array[k] < array[pivot]) {
                    pivot = moveRight(k, pivot, array);
                    k++;
                    //System.out.println("right " + pivot);
                }
            }

            rellocateQ(startPos, pivot, array);
            rellocateQ(pivot, endPos, array);
        }

    //System.out.println(Arrays.toString(array));

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