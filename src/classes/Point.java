package classes;

/**
 * Created by Harut on 20.05.2017.
 */
public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void printObj(){
        System.out.println("x = " + getX() + " y = " + getY());
    }

    public Point(){

    }
    public Point(double xValue, double yValue){
        setX(xValue);
        setY(yValue);
    }
    public double distance(){
      return Math.sqrt(getX()*getX() + getY()*getY());
    }

    public String Quarter(){
        if(x == 0 && y==0){
            return  "0";
        }else if(x>0 && y>0){
            return  "1";
        }else if(x<0 && y>0){
            return "2";
        }else if(x<0 && y<0) {
            return "3";
        }else if(x==0){
            return  "OY";
        }else if(y == 0){
            return "OX";
        }
        return  "4";
    }
    public Point invertStart(){
        return new Point(-x, -y);
    }

    public Point invertStartOX(){
        return new Point(x, -y);
    }
    public Point invertStartOY(){
        return new Point(-x, y);
    }

    public Point copy(){
        Point t = new Point();
        t.setX(this.getX());
        t.setY(this.getY());
        return t;
    }
}
