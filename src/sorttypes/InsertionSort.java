package sorttypes;

public class InsertionSort {

    private String name = "InsertionSort";
    private int[] array;
    private long timeConsumedMillis;

    public InsertionSort(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }
    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}


    public static InsertionSort insertionSort(){
        //int[] array = {9, 4, 3, 6, 2};
        int[] array = CloneArray.cloneArray();
        long start = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++){
            int temp = array[i + 1];
            if (temp < array[i]) {
                int pos = -1;
                if (temp <= array[0]) pos = 0;
                else {
                    for (int k = i; k > 0; k--) {
                        if (temp > array[k - 1]) {
                            pos = k;
                            break;
                        }
                    }
                }
                relocate(i, pos, array, temp);
            }
        }

        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;
        return new InsertionSort (array, timeConsumedMillis);
    }


    public static void relocate(int index, int dest, int[] array, int item){
        for (int j = index + 1; j > dest; j--) {
            array[j] = array[j - 1];
        }
        array[dest] = item;
    }

    public void printOut(){
        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(demoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
    }
}
