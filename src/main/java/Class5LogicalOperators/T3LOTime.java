package Class5LogicalOperators;

import java.util.Scanner;

public class T3LOTime {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.print("Please Enter the current time in 24th format ");
        int hour=qq.nextInt();
        if(hour>=1&&hour<=11){
            System.out.println("It's Morning");
        } else if (hour>=12&&hour<=15) {
            System.out.println("It's Afternoon");
        } else if (hour>=16&&hour<=20) {
            System.out.println("It's Evening");
        }else if(hour>=21&&hour<=24){
            System.out.println("It's Night");
        }else {
            System.out.println("Invalid");
        }
    }
}
