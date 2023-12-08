package Class4Scanner;

import java.util.Scanner;

public class E7ScannerChar {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("Please Enter Your gender M/F");
        char gender=ab.next().charAt(0);
        System.out.println("Your gender is  "+gender);
    }
}
