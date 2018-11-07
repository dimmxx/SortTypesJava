package sorttypes;

public class CloneArray{

     public static int[] cloneArray (){

        int[] clone =  new int[GenerateArray.getSIZE()];
        for(int i = 0; i < GenerateArray.getSIZE(); i++) clone[i] = demoSort.intArrayOrigin[i];
        return clone;
        }
}
