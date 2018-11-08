package sorttypes;

public class StupidSortMod {

    private int[] array;
    private long timeConsumedMillis;

    public StupidSortMod(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}

    public static StupidSortMod stupidSortMod(){
        int[] array = CloneArray.cloneArray();

        long start = System.currentTimeMillis();


        int k = 0;
        for(int i = 0; i < array.length - 1; i++){
            int temp = array[i];

            if (array[i] > array[i + 1]){
                array[i] = array[i + 1];
                array[i + 1] = temp;
                k = i;
            }
        }


        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;

        return new StupidSortMod (array, timeConsumedMillis);
    }
}