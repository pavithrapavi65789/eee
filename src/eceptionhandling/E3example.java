package eceptionhandling;

public class E3example {
    public static void main(String[] args) {
        try {
            int balance = 2000;
            int withdraw = 3000;
            if (withdraw > balance) {
                throw new ArithmeticException("insuffient fund");

            }
            System.out.println("withdraw successful");
        } catch (ArithmeticException e) {
            System.out.println("exception caught :" + e.getMessage());
        }
    }


}
