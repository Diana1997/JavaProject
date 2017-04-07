import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ITSchool.user on 06.04.2017.
 */
public class Day20170406 {
    public static void main(String[] args) {
        //avogadroyi tiv@ 1-ic 1001 mijakayqum
        int a , b;
        int count ;
         for(int n = 1; n < 1001; ++n){
          a = n;
          count = 0;
          while( a != 0){
             a /=10;
             ++count;
          }

          a = n;
          int sum = 0;
          while( a != 0 ){
              b = a % 10;
              sum += (int) Math.pow(b, count);
              a /= 10;
          }

          if(sum == n){
              System.out.println(n);
          }

       }
    }
}
