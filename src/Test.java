import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ITSchool.user on 04.04.2017.
 */
public class Test {
    public static void main(String[] args){

    //series 1-3
        /*int[] arr = {1,2 ,3,4,5,6,7,8,9,10};
        int sum = 0, p = 1;
        for(int i=0; i <arr.length; ++i){
            sum += arr[i];
            p *=  arr[i];
        }
        System.out.println(sum);
        System.out.println(p);
        System.out.println( (double) sum/2);
        */

       /* int n  = 5, a= 2, b = 5;
        double arr[] = new double[n];
        double sum = 0, p = 1;
        for(int i = 0; i < n; ++i){
            arr[i] =(b - a + 1) * Math.random() + a ;
            System.out.println(arr[i]);
            sum += arr[i];
            p += arr[i];
        }
        System.out.println(sum);
        System.out.println(p); */

       //series5
      /*  int n  = 5, a= 2, b = 5;
        double arr[] = new double[n];
        double sum = 0;
        for(int i = 0; i < n; ++i) {
            arr[i] = (b - a + 1) * Math.random() + a;
            System.out.println((int) arr[i]);
            sum += (int) arr[i];
        }
        System.out.println(sum);
        */

        //series6
    /*    int n  = 5, a= 2, b = 5;
        double arr[] = new double[n];
        double sum = 0, p = 1;
        for(int i = 0; i < n; ++i) {
            arr[i] = (b - a + 1) * Math.random() + a;
            System.out.println(arr[i] - (int) arr[i]);
            p *= arr[i] - (int) arr[i];
        }
        System.out.println(sum);
*/
        //series7
       /* int n  = 5, a= 2, b = 10;
        double arr[] = new double[n];
        double sum = 0, p = 1;
        for(int i = 0; i < n; ++i) {
            arr[i] = (b - a + 1) * Math.random() + a;
            double c  = Math.round(arr[i] - (int) arr[i]);
            System.out.println(c);
            p *= c;
        }
        System.out.println(p);

        */

        //series8
        int n  = 6;
        int  arr[] = new int[n];
        for(int i=0; i<n; ++i){
            arr[i] =  i * i;
        }

    }
}