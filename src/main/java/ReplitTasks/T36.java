package ReplitTasks;

import java.util.Scanner;

public class T36 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1=qq.nextLine();
        String word2=qq.nextLine();
        System.out.println("Please enter two numbers");
        int int1=qq.nextInt();
        int int2=qq.nextInt();
        if(int1==int2&&word1==word2){
            System.out.println("AND");
        } else if (int1==int2 || word1==word2) {
            System.out.println("OR");
        } else if (int1!=int2 && word1==word2) {
            System.out.println("NONE");
        }
    }
}
