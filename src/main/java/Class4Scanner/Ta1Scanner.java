package Class4Scanner;

import java.util.Scanner;

public class Ta1Scanner {
    public static void main(String[] args) {

        Scanner ab=new Scanner(System.in);
        System.out.println("Enter the amount of the loan");
        int loan=ab.nextInt();

        if (loan<=200000){
            System.out.println("I will lend the money");
        }else {
            System.out.println("I will reject the loan");
        }
    }
}
