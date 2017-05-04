package Praktika;


import java.util.Arrays;

/**
 * Created by Harut on 02.05.2017.
 */
public class masiv
{


    public static void main(String[] args) {
        //abr xndir 1
        final int n = 7;
        final int[] arr = new int[n];

        for(int i = 0, current=1; i < n; ++i, current +=2){
            arr[i] = current;
        }
        System.out.println(Arrays.toString(arr));


        final int a = 5;
        final int d = 2;
       // final int n  = 4;
        final int[] b = new int[n];
        for (int i = 0, c= a; i<n; ++i, c += d){
            b[i] = c;
        }
        System.out.println(Arrays.toString(b));


        final int[] fib= new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i<n; ++i)
        {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(Arrays.toString(fib));

        int z = 2, x = 3, sum=0;
        final int[] c = new int[n];
        c[0] = z;
        c[1] = x;
        sum = c[0] + c[1];
        for(int i = 2; i <n; ++i){
            c[i] = sum;
            sum += c[i];
        }
        System.out.println(Arrays.toString(c));

        //Arrays19
        int m[] = {1,2,3,4,4,6,7,8,9,10};
        int p = 0;
        for(int i = m.length-2; i>0; --i){
            if(m[i]> m[0] && m[i]<m[m.length-1]){
                p = i;
                break;
            }
        }
        System.out.println(p);

        //Arrays20
        /*
        int k = 2, l = 4, sum1 =0;
        for (int i = k; i<l+1; ++i ){
            sum1 += m[i];
        }
        System.out.println(sum1);
*/
        //Arrays21
        int k = 2, l = 4, sum1 =0;
        for (int i = k; i<l+1; ++i ){
            sum1 += m[i];
        }
        System.out.println(sum1/(double)(l-k+1));

        //ARrays51
        final int[] g = {1,2,3,4};
        final int[] h = {10,20,30,40};
        int temp;
        for(int i = 0; i< g.length; ++i){
            temp =  g[i];
            g[i] = h[i];
            h[i] = temp;
        }

        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(h));

        //Arrays52
        final double[] e = {10,20,1,2,3,5,56,41};
        final double[] t = new double[e.length];
        double temp1;
        for(int i = 0; i<e.length; ++i){
            if(e[i]<5){
                t[i] = 2 * e[i];
            }else{
                t[i] = e[i] /2;
            }
        }
        System.out.println(Arrays.toString(t));

        //Arrays53
        double[] y = new double[g.length];
        for(int i = 0; i<g.length; ++i){
            if(g[i] > h[i]){
                y[i] = g[i];
            }else{
                y[i] = h[i];
            }
        }

        System.out.println(Arrays.toString(y));

        //Arrays54
        int[] j = {1,2,1,3,4,5};


    }
}
