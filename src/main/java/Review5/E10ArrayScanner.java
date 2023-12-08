package Review5;

import java.util.Arrays;
import java.util.Scanner;

public class E10ArrayScanner {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.print("Please Enter the size of the Array ");
        int size= qq.nextInt();
        int [] numbers=new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please Enter the number "+(i+1));
            numbers[i]= qq.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
