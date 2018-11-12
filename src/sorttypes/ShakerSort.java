package sorttypes;

public class ShakerSort {

    private String name = "ShakerSort";
    private int[] array;
    private long timeConsumedMillis;

    public ShakerSort(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}

    public static ShakerSort shakerSort(){
       int[] array = CloneArray.cloneArray();
        //int[] array = {9, 7, 1};
        long start = System.currentTimeMillis();

        for(int i = 0; i < array.length/2; i++){
            for(int k = 0; k < array.length - 1 - i; k++){
                int temp = array[k];
                if (array[k] > array[k + 1]) {
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }

            for(int j = array.length - 2; j > 0; j--){
                int temp = array[j];
                if(array[j] < array[j - 1]){
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;

        return new ShakerSort(array, timeConsumedMillis);
    }

     public void printOut(){
        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(demoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
    }
}
