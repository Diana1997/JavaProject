package Test;


public class First {

    private int a;

    public int setA(int a1){
        return  a = a1;
    }

    public int getA(){
        return a;
    }

  First(){
        setA(5);
    }


    public static void main(String[] args) {
        First f = new First();
        System.out.println(f);
        System.out.println("psvm");
    }

}
