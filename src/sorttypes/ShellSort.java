package sorttypes;

public class ShellSort {

    private String name = "ShellSort";
    private int[] array;
    private long timeConsumedMillis;

    public ShellSort(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}

    public static ShellSort shellSort(){
        int[] array = CloneArray.cloneArray();
        //int[] array = {3, 5, 0, 1, 4, 3};
        long start = System.currentTimeMillis();

        int gap = array.length / 2;

        while (gap != 1){
            for (int i = 0; i < gap - 1; i++){
                if (array[i] > array[i + gap]) CombSort.swap(array, i, i + gap);
            }
            gap /= 2;
        }

        //Selection Sort
        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int k = i + 1; k < array.length; k++){
                if(array[k] < array[min]) min = k;
            }
            if(min != i) CombSort.swap(array, i, min);
        }

        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;
        return new ShellSort (array, timeConsumedMillis);
    }

    public void printOut(){
        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(demoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
    }
}
