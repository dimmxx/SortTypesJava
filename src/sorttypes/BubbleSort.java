package sorttypes;

public class BubbleSort {

    public static int[] bubbleSort(int[] array){

        for(int i = 0; i < array.length - 1; i++){
            for(int k = 0; k < array.length - 1 - i; k++){
                int temp = array[k];
                if(array[k] > array[k + 1]){
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        return array;
    }
}
