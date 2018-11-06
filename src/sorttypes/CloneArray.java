package sorttypes;

public class CloneArray<T>{

     public T[] cloneArray (T[] array){

         T[] clone = (T[]) new Object[array.length];
         for(int i = 0; i < array.length; i++) clone[i] = array[i];




        return clone;
        }




}
