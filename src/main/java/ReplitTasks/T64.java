package ReplitTasks;

import java.util.Scanner;

/*You should input:
int end;
Write a for loop that will print out a series of numbers starting at 0
and ending at the doubled value of end(value must be taken from a user), exclusive.
Each number should be on the same line, separated by a space. */
public class T64 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Enter the endValue/2");
        int end= qq.nextInt();
        for(int i=0;i<(end*2);i++){
            System.out.print(i+" ");
        }



    }
}
