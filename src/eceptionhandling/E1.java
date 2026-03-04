package eceptionhandling;

public class E1 {
    public static void main(String[] args) {
        int i = 10, j = 0, k = 0;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            System.out.println("you can't divide anything by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ivalid index");
        } catch (Exception e) {
            System.out.println("Unkown exception");
        } finally {
            System.out.println("this block will  got executed");
            System.out.println("hello");

        }
    }
}
