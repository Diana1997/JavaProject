import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ITSchool.user on 06.04.2017.
 */
public class Day20170406 {
    public static void main(String[] args) {
        int n = 1191;
        boolean status = false;
        int a;
        a = n;
        while(a != 0) {
            a = a / 10;
            System.out.println("a = " + a);
            double b = Math.sqrt(a);
            System.out.println(b);
            int c = (int) b;

            System.out.println(c);
            if(b == c && c>0 ){
                status = true;
                System.out.println("yes");
                break;
            }
        }
    }
}
