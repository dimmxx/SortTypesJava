package sorttypes;

public class SelectionSort {

    private String name = "SelectionSort";
    private int[] array;
    private long timeConsumedMillis;

    public SelectionSort(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}


    public static SelectionSort selectionSort(){
        int[] array = CloneArray.cloneArray();
        //int[] array = {9, 3, 5, 1};
        long start = System.currentTimeMillis();

        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int k = i + 1; k < array.length; k++){
                if(array[k] < array[min]) min = k;
            }
            if(min != i) CombSort.swap(array, i, min);
        }

        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;
        return new SelectionSort (array, timeConsumedMillis);
    }

    public void printOut(){
        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(DemoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
    }

}










