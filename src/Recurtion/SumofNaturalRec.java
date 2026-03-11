package Recurtion;

public class SumofNaturalRec {
    static int sum(int x){
        if(x==1){
            return 1;

        }
        else {
            return x + sum(x-1);   //recursive case
        }
    }

    public static void main(String[] args) {
        int num =1000;
      int result=  sum(num);
        System.out.println(result);
    }
}
