package Homework;

import java.util.Scanner;

public class ReplitTest {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please eneter your gender");
        char gender=qq.next().charAt(0);
        System.out.println("Please enter your age");
        int age=qq.nextInt();
        if(age>25){
            if(gender=='m'){
                System.out.println("Man");
            }else{
                System.out.println("Woman");
            }
        }else if(age<25) {
            if (gender == 'm') {
                System.out.println("Boy");
            } else {
                System.out.println("Girl");
            }
        }
    }
}
