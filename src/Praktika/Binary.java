package Praktika;

/**
 * Created by Harut on 28.04.2017.
 */
public class Binary {

    //gtnel tvi bitayin nerkayacman mej 1-eri qanak@, xndir1
    static int countOfBitOne(int number){
        int i = 0;
        int count=0;
        while(i<32){
            if( (number>>i & 0x1)== 1)
            {
                ++count;
            }
            ++i;
        }
        return count;
    }

    public static String numberType(int number){
        return number % 2 == 0 ? "even" : "odd";
    }

    static int f1(int x){
        return x>=1 && x<10 ? 90 : (x>10) ? 80 : 500;
    }



    //stugel tiv@ 2m + 2n astichan e te voch
    static boolean f2(int number){
       int y = (number & (number - 1));
       return y > 2 && (y & (y-1)) == 0;
    }

    //stugel tiv@ 2m + 2n+ 2k astichan e te voch


    public static void main(String[] args) {
        //xndir1
        System.out.println(countOfBitOne(-2));
        System.out.println(numberType(12));

        System.out.println(f1(22));
        System.out.println(f2(4));
    }
}
