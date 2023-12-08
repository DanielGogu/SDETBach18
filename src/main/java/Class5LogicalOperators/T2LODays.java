package Class5LogicalOperators;

import java.util.Scanner;

public class T2LODays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the day number ");
        int day=sc.nextInt();

        if (day>=1&&day<=5){
            System.out.println("It is a weekday");
        } else if (day>=6&&day<=7) {
            System.out.println("It is a weekend");
        }else {
            System.out.println("Invalid day");
        }
    }
}
