package ReplitTasks;

import java.util.Scanner;

/* **For you to do:**
 Ask the user to enter any number from 1-7.
 Based on the number define the day of the week
 **Example Output:*
 Input a number between 1-7
 Friday
 **Example Output:**
 Input a number between 1-7
 Invalid
 */
public class T45SwitchWeekDays {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Enter any number from 1-7");
        int num=qq.nextInt();
        String day="invalid";
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }


    }
}
