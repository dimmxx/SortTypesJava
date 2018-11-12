package sorttypes;

public class PrintOutArray {

    public static void printOutArray (int[] array){

        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            if(i < array.length - 1) System.out.print(array[i] + ", ");
            else System.out.println(array[i] + "]");
        }
        //System.out.println();
    }
}
