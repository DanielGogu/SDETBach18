package Tests;

import java.util.Scanner;

public class T1Replit {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers ");
        double num1=qq.nextDouble();
        double num2=qq.nextDouble();
        double num3=qq.nextDouble();
        if(num1>num2&&num1>num3){
            System.out.println("The largest number is "+num1);
        }else if(num2>num3) {
            System.out.println("The largest number is "+num2);
        } else {
            System.out.println("The largest number is "+num3);
        }
    }

}
