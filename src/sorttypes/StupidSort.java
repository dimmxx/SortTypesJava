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

        return new StupidSort (array, timeConsumedMillis);
    }
}
