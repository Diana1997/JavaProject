import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ITSchool.user on 04.04.2017.
 */
public class Test {
    public static void main(String[] args) {
  /*  int n=40, count=0, k = 2;
    while(n % k == 0){
        count++;
        k*=2;
    }
        System.out.println(count);
    }*/


       int n = 7, k = 0, sum = 0;
        while (true) {
            if (sum > n) {
                break;
            }

            sum += ++k;
        }
        System.out.print(k);
       /* if (sum == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");

        }*/


   /*     int  p = 100, l = 2;
        switch(l){
            case 2:
                p=   p / 1000000;
                break;
            case 3:
                p = p / 1000;
                break;
            case 4:
                p = p * 1000;
                break;
            case 5:
                p = p * 100;
        }
        System.out.println(p);*/

        /*int sum = 0;
        for(int i = 0; i<21; i++){
            if(i % 3 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
*/
    }
}