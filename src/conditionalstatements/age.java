package conditionalstatements;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n>18){
            System.out.println("eligible to vote");}
        else{
            System.out.println("not eligible to vote" );
    }

    }
}
