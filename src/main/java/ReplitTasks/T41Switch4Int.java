package ReplitTasks;

import java.util.Scanner;

/*Write a program using the switch statement
Let us consider the scenario regarding the born baby age
First Output: "Enter the age of the Child"
case 1: if age is 1 print as "You can Crawl"
case 2 : if age is 2 print as  "You can Talk"
case 3: If age is 3 print as "You can Dance"
case 4: if age is 4 print as "You can get Trouble"
Other than this age (1-4) it should print "I don't know how old you are"

 */
public class T41Switch4Int {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Enter the age of the child");
        int age=qq.nextInt();
        switch (age){
            case 1:
                System.out.println("You can Crawl");
                break;
            case 2:
                System.out.println("You can Talk");
                break;
            case 3:
                System.out.println("You can dance");
                break;
            case 4:
                System.out.println("You can get trouble");
                break;
            default:
                System.out.println("I don't know how old you are");
        }
    }
}
