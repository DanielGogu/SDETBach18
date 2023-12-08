package Tests;

import java.util.Scanner;

public class T2replit {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        String elig="0";
        boolean loan=qq.nextBoolean();
        if(loan){
            System.out.println("What is your credit score?");
            int score=qq.nextInt();
            if(score<600){
                elig="Not eligible";
            }else if(score>=600&&score<=700){
                elig="Maybe eligible";
            }else if(score>700&&score<=800){
                elig="Eligible";
            }else{
                elig="Definitely eligible";
            }
        }else{
            elig="Unknown";
        }
        System.out.println("The elegibility is "+elig);
    }
}
