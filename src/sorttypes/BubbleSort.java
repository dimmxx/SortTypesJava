package sorttypes;

public class BubbleSort {

    public static <T extends Comparable> void bubbleSort(T[] array){

        for(int i = 0; i < array.length - 1; i++){
            for(int k = 0; k < array.length - 1 - i; k++){
                T temp = array[k];
                if(array[k].compareTo(array[k + 1]) < 1){
                    array[k] = array[k + 1];
                    array[k + 1] = temp;

                }
            }
        }





    }






}
