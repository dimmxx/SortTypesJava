package sorttypes;

public class BubbleSortMod {

    private String name = "BubbleSortMod";
    private int[] array;
    private long timeConsumedMillis;

    public BubbleSortMod(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}

    public static BubbleSortMod bubbleSortMod(){
        int[] array = CloneArray.cloneArray();
        long start = System.currentTimeMillis();

        for(int i = 0; i < array.length - 1; i++){
            boolean sorted = true;
            for(int k = 0; k < array.length - 1 - i; k++){
                int temp = array[k];
                if(array[k] > array[k + 1]){
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    sorted = false;
                }
            }
            if(sorted) break;
        }
        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;

        return new BubbleSortMod (array, timeConsumedMillis);
    }

    public void printOut(){

        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(DemoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
    }
}
