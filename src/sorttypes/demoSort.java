package sorttypes;
import java.util.Arrays;

public class demoSort {

    public static void main(String[] args) {

        final Integer[] intArrayOrigin = GenerateArray.generateIntArray();
        //final Float[] floatArrayOrigin = GenerateArray.generateFloatArray();
        //final String[] stringArrayOrigin = GenerateArray.generateStringArray();

        PrintOutArray.printOutArray(intArrayOrigin);

        CloneArray clone = new CloneArray();

        Object intCloneArray[] = clone.cloneArray(intArrayOrigin);

        PrintOutArray.printOutArray(intCloneArray);

        BubbleSort.bubbleSort(intArrayOrigin);
        PrintOutArray.printOutArray(intCloneArray);

    }




}
