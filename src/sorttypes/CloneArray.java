package sorttypes;

public class CloneArray{

     public static int[] cloneArray (int[] array){

        int[] clone =  new int[array.length];
        for(int i = 0; i < array.length; i++) clone[i] = array[i];
        return clone;
        }
}
