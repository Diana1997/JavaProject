package classes;

import java.util.Arrays;

/**
 * Created by Harut on 23.05.2017.
 */
public class IntegerList {
    private int[] arr;

    public IntegerList(){
        arr = new int[0];
    }

    @Override
    public String toString(){
        return Arrays.toString(this.arr);
    }

    public void add(int element){
        int[] newArray = new int[arr.length+1];
        for(int i=0; i<arr.length; ++i){
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = element;
        this.arr = newArray;
    }
}
