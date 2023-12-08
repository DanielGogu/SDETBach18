package Class5LogicalOperators;

import java.util.Scanner;

public class TSwitch2 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.print("Please enter your Grade(A,B,C,D) ");
        char grade=qq.next().charAt(0);
        switch (grade){
            case 'A' :
                System.out.println("Excellent");
            break;
            case 'B':
                System.out.println("Good");
            break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }

    }
}
