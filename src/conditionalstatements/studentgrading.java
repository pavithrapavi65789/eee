package conditionalstatements;

import java.util.Scanner;

public class studentgrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks for subject1");
        int s1=sc.nextInt();
        System.out.println("enter the marks for subject2");
        int s2=sc.nextInt();
        System.out.println("enter the marks for subject3");
        int s3=sc.nextInt();
        System.out.println("enter the marks for subject4");
        int s4=sc.nextInt();
        System.out.println("enter the marks for subject5");
        int s5=sc.nextInt();
        int total=s1+s2+s3+s4+s5;
        System.out.println("total = " + total);
        double percentage=(total/500.0*100);
        System.out.println("Percentage = " + percentage);
        if (percentage >=75){
            System.out.println("grade A");}
        else if (percentage >=50){
            System.out.println("grade B");}
        else if (percentage >=30){
            System.out.println("grade C");}
        else{
            System.out.println("fail");
        }



    }
}
