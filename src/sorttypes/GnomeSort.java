package sorttypes;

public class GnomeSort {

    private String name = "GnomeSort";
    private int[] array;
    private long timeConsumedMillis;

    public GnomeSort(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}

    public static GnomeSort gnomeSort(){
        int[] array = CloneArray.cloneArray();
        //int[] array = {8, 9, 7, 1};
        long start = System.currentTimeMillis();

        int k = 0;
        int i = 1;

        while (i < array.length){
            if(array[i] >= array[k]) {
                i++;
                k++;
            }else{
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;
                i--;
                k--;
                if(k < 0) k = 0;
                if(i < 1) i = 1;
                }
        }
        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;

        return new GnomeSort(array, timeConsumedMillis);
    }

     public void printOut(){
        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(demoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
    }
}
