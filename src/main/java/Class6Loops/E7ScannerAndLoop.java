package Class6Loops;

import java.util.Scanner;

public class E7ScannerAndLoop {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start= qq.nextInt();
        System.out.println("Please enter the end point");
        int end= qq.nextInt();
        System.out.println("Please eneter the step size as well");
        int step= qq.nextInt();
        while (start<=end){
            System.out.print(start+" ");
            start=start+step;
        }
    }
}
