package conditionalstatements;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n%3==0 && n%7==0){
            System.out.println(" the number divisible by both 3 and 7 ");}
        else{
            System.out.println("get lost");
        }

    }

}
