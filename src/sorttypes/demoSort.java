package sorttypes;
import java.util.Arrays;

public class demoSort {

    public static void main(String[] args) {

        final Integer[] intArrayOrigin = GenerateArray.generateIntArray();
        //final Float[] floatArrayOrigin = GenerateArray.generateFloatArray();
        //final String[] stringArrayOrigin = GenerateArray.generateStringArray();

        PrintOutArray.printOutArray(intArrayOrigin);

        CloneArray clone = new CloneArray();
        BubbleSort bubble = new BubbleSort();

        Object intCloneArray[] = clone.cloneArray(intArrayOrigin);

        PrintOutArray.printOutArray(bubble.bubbleSort,
        PrintOutArray.printOutArray(intCloneArray);

    }




}
