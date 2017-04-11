import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by ITSchool.user on 04.04.2017.
 */
public class Test {
    public static void main(String[] args){
        final int k = 3, n = 5;
        final int[] arr = new int[n];
        for(int i = 0; i<n; ++i){
            arr[i] = 3 * i + 1;
        }

       System.out.println(Arrays.toString(arr));

        //series26
       /* for(int i = 0; i<n; ++i){
            int res = 1;
            for(int j =0; j<k; ++j){
                res = res * arr[i];
            }
            System.out.println(res + " ");
        }
        */

        //series26
       /*for (int i = 0; i<n; ++i){
           int res = arr[i];
           for(int j =0; j<k-1;++j){
               res *= arr[i];
           }
           System.out.println(res + " ");
       }
       */

       //series27
     /*  for(int i = 0; i<n; ++i){
           int res = arr[i];
           for(int j = 0; j<i; ++j){
               res *= arr[i];
           }
           System.out.println(res + " ");
       }
       */

        //series28
      /*  for(int i = n-1; i>0; ++i){
            int res = arr[i];
            for(int ){

            }
        }
        */


      //sharjel masivi elementner@  [1, 4, 7, 10, 13] [13, 10, 7, 4, 1]
      /* for(int i=0; i < n/2; ++i){
           int temp = arr[i];
           arr[i] = arr[n - i - 1];
           arr[n - i -  1] = temp;
      }

        System.out.println(Arrays.toString(arr));
        */


      //sharjel masivi elementner@  [1, 4, 7, 10]   [7, 10, 1, 4]
        /*
        int f = (n + 1)/2;
        int temp;
        for(int i=0; i < n/2; ++i) {
                temp = arr[i];
                arr[i] = arr[i + f];
                arr[i + f] = temp;
        }
        System.out.println(Arrays.toString(arr));
        */

        //hamachap texaoxutyun, stanal masivi elementner@ hakarak hajordakanutyamd [1, 4, 7, 10, 13]   [13, 10, 7, 4, 1]
        /*
        int temp;
        for(int i=0; i<n/2; ++i){
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        */


    }
}