package ReplitTasks;

import java.util.Scanner;

/*Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting
 at 0 and ending at the x(value must be taken from a user), exclusive.
*/
public class T63 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.print("Enter the ending number of the series ");
        int num= qq.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(i);
        }

    }
}
