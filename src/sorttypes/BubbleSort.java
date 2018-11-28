package sorttypes;

public class BubbleSort {

    private String name = "BubbleSort";
    private int[] array;
    private long timeConsumedMillis;

    public BubbleSort(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}

    public static BubbleSort bubbleSort(){
        int[] array = CloneArray.cloneArray();
        long start = System.currentTimeMillis();

        for(int i = 0; i < array.length - 1; i++){
            for(int k = 0; k < array.length - 1 - i; k++){
                int temp = array[k];
                if(array[k] > array[k + 1]){
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;

        return new BubbleSort (array, timeConsumedMillis);
    }

    public void printOut(){

        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(DemoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
    }



}