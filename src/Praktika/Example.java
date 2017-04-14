package Praktika;
import java.util.Arrays;

/**
 * Created by Harut on 14.04.2017.
 */
public class Example {
    public static void main(String[] args) {

        //gtnel masivi mej araji zuyg element@ ev mnacac zuyg elementnerin gumarel ayd elem@
        int n = 5;
        int[]  arr = {1,2,3,4,5};
        boolean status = false, st = true;
        int temp=0;
        for(int i=0; i<n; ++i){
            if(arr[i] % 2 == 0 && st){
                temp = arr[i];
                status = true;
                st = false;
            }

            if(arr[i] % 2 == 0 && status){
                arr[i] =  arr[i] + temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
