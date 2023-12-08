package ReplitTasks;

import java.util.Scanner;

/*Write a program that creates a String array with size 7.
Ask the user to input Days of a week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array
Example:
Please enter day 1 of the week Sunday
Please enter day 2 of the week Monday
Please enter day 3 of the week Tuesday etc*/
public class T76ArrayScanner {
    public static void main(String[] args) {
        String[] weekDays=new String[7];
        Scanner qq=new Scanner(System.in);

        for (int i = 0; i<7;i++){
            System.out.print("Please enter day "+(i+1)+" of the week ");
            weekDays[i]= qq.next();
        }
        System.out.println();
        for (int i = 0; i<7; i++){
            System.out.println(weekDays[i]);
            System.out.println();
        }

    }
}
