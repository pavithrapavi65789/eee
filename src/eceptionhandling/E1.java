package eceptionhandling;

public class E1 {
    public static void main(String[] args) {
        int i=10,j=0,k=0;
        try {
            k = i / j;
            System.out.println(k);
        }
        catch(ArithmeticException e){
            System.out.println("you can't divide anything by 0" );
        }
        System.out.println("hello");

    }
}
