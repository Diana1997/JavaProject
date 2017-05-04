package Praktika;

import java.util.Arrays;

/**
 * Created by Harut on 04.05.2017.
 */
public class Array {

    static void Array70(){
        int[] arr = {1,2,3,4,5,6};
        for(int i=0; i< arr.length/2; ++i){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void Array71() {
        int[] arr = {1,2,3,4,5,6};
        for(int i=arr.length-1; i>=0; --i){
            System.out.print(arr[i] + "\t");
        }
    }

    static void Array72() {
        int[] arr = {1,2,3,4,5,6};
        int k = 2, l = 4;
        for(int i=arr.length-1; i>=0; --i){
            System.out.print(arr[i] + "\t");
        }
    }
        public static void main(String[] args) {
        //Array64
        int[] a = {13,2,1};
        int[] b = {9,8,2};
        int[] c = {11,10,6};
        int[] d = new int[a.length+b.length+c.length];

        int f = a.length+b.length+c.length;
        int c1 = 0, c2  = 0 , c3 = 0;
        for(int i  = 0; i<f; ++i){
         if ((c1<a.length) && ((c2>=b.length) || (a[c1]>=b[c2])) && ((c3>=c.length)  || (a[c1]>c[c3]))) {
             d[i] = a[c1];
             ++c1;
         }else if((c2<b.length) && ((c3>=c.length) || (b[c2] > c[c3]))){
             d[i] = b[c2];
             ++c2;
         }else {
             d[i] = c[c3];
             ++c3;
         }
        }
        System.out.println(Arrays.toString(d));


        System.out.println("-------------------");
        Array70();
        Array71();
    }

}
