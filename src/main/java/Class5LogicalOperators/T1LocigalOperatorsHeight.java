package Class5LogicalOperators;

import java.util.Scanner;

public class T1LocigalOperatorsHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the height in inches");
        double height=sc.nextDouble();
        if(height<60){
            System.out.println("Short");
        } else if (height>=60&&height<=72) {
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }
    }
}
