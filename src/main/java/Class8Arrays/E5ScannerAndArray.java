package Class8Arrays;

import java.util.Scanner;

public class E5ScannerAndArray {
    public static void main(String[] args) {
        int [] numbers=new int[5];
        Scanner qq=new Scanner(System.in);
        for (int i=0; i< numbers.length;i++){
            System.out.print("Please Enter a number "+(i+1));
            numbers[i]= qq.nextInt();
        }
        System.out.println("Here are all the numbers that you entered");
        for (int i = 0 ; i < numbers.length ; i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
