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
        long start = System.currentTimeMillis();







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
