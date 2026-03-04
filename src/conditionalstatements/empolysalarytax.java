package conditionalstatements;

import java.util.Scanner;

public class empolysalarytax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary");
        double sal = sc.nextDouble();
        double tax;
        double netsalary;
        if(sal<300000){
            tax=0;}
        else{
            if(sal<700000){
                tax = sal*0.01;}
            else{
                tax=sal*0.20;
            }

            }
        netsalary=sal-tax;
        System.out.println("tax amount"+tax);
        System.out.println("net salary"+netsalary);


    }
}
