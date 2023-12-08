package Class5LogicalOperators;

import java.util.Scanner;

public class T4LOBirthMonth {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.print("Please eneter your birth month ");
        String month=qq.next();
        if (month.equals("January")||month.equals("February")||month.equals("December")){
            System.out.println("Born in Winter");
        } else if (month.equals("March")||month.equals("April")||month.equals("May")) {
            System.out.println("Born in Spring");
        } else if (month.equals("June")||month.equals("July")||month.equals("August")) {
            System.out.println("Born in Summer");
        } else if (month.equals("September")||month.equals("October")||month.equals("November")) {
            System.out.println("Born in Autumn");
        }else {
            System.out.println("Wrong Month Entered!");
        }
    }
}
