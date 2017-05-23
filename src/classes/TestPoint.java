package classes;

/**
 * Created by Harut on 20.05.2017.
 */
public class TestPoint {

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.getX());


        p.setX(3);

        p.setY(4);
        p.printObj();
       /* System.out.println("----------------distance()---------------------");
        System.out.println(p.distance());
        System.out.println("----------------Quarter()---------------------");
        //System.out.println(p.Quarter());


        Point q1 = new Point(0,0);
        Point q2 = new Point(0,1);
        Point q3 = new Point(1,0);
        Point q4 = new Point(1,1);
        Point q5 = new Point(-1,1);
        Point q6 = new Point(-1,-1);
        Point q7 = new Point(1,-1);

        System.out.println(q1.Quarter());
        System.out.println(q2.Quarter());
        System.out.println(q3.Quarter());
        System.out.println(q4.Quarter());
        System.out.println(q5.Quarter());
        System.out.println(q6.Quarter());
        System.out.println(q7.Quarter());

        System.out.println("----------------invertStart()---------------------");
        p.invertStart().printObj();
        System.out.println();
        System.out.println("----------------invertStart()---------------------");
        p.invertStartOX().printObj();
        System.out.println();

        */

        Point t = p.copy();
        t.printObj();
        //System.out.println(t == p);

    }
}
