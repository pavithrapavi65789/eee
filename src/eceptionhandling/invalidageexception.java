package eceptionhandling;

public class invalidageexception extends RuntimeException{
    invalidageexception(String msg){
        super(msg);
    }

}
class Driver{
    static void checkage(int age){
        if (age<18){
            throw new invalidageexception("age must be over 18");

        }
        System.out.println("you are eligible");

    }
    public static void main(String[] args) {
        checkage(26);

    }
}
