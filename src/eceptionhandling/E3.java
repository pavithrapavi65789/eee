package eceptionhandling;

public class E3 {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("acess granted");
        } else {
            throw new RuntimeException("acess deined");


        }
    }
}