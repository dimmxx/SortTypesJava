package sorttypes;

public class CombSort {

    private String name = "CombSortSort";
    private int[] array;
    private long timeConsumedMillis;

    public CombSort(int[] array, long timeConsumedMillis){
        this.array = array;
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public int[] getArray(){return array;}
    public long getTimeConsumedMillis(){return timeConsumedMillis;}

    public static CombSort combSort(){
        //int[] array = CloneArray.cloneArray();
        int[] array = {10, 6, 1, 5, 1, 9, 3, 7, 3, 0};
        long start = System.currentTimeMillis();

        double gapD = array.length/1.247;
        int gap = (int) gapD;

        while (gap != 1){
            

        }





        long end = System.currentTimeMillis();
        long timeConsumedMillis = end - start;
        return new CombSort (array, timeConsumedMillis);
    }


    public static void swap (int[] array, int ind1, int ind2){
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    public void printOut(){
        System.out.println();
        System.out.println(name + " (length " + array.length + ")" + ":");
        PrintOutArray.printOutArray(demoSort.intArrayOrigin);
        PrintOutArray.printOutArray(array);
        System.out.println("Time elapsed: " + timeConsumedMillis + "ms");
    }






}
