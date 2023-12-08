package Class12;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please enter the word ");
        String word= qq.next();
        String reversedWord="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversedWord=reversedWord+word.charAt(i);
        }
        if(word.equalsIgnoreCase(reversedWord)){
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("It's not a Palindrome");
        }
    }
}
