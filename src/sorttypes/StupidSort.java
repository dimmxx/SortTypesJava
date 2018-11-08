package sorttypes;

public class StupidSort {

    private int[] array;
    private long timeConsumedMillis;

    public StupidSort(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}



    public static StupidSort stupidSort(){
        int[] array = CloneArray.cloneArray();

        long start = System.currentTimeMillis();


        for(int i = 0; i < array.length - 1; i++){
            int temp = array[i];
            if (array[i] > array[i + 1]){
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = -1;
            }
        }


        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;

        return new StupidSort (array, timeConsumedMillis);
    }
}
