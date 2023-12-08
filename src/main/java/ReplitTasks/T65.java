package ReplitTasks;

import java.util.Scanner;

/* Given the following inputs:
Write a for loop that will print out a series of numbers
 starting at one less than x and ending at 0.*/
public class T65 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.print("Enter the Starting Number of the series ");
        int num= qq.nextInt();
        for (int i=num-1;i>=0;i--){
            System.out.println(i);
        }

    }
}
