package ReplitTasks;

import java.util.Scanner;

/*Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order. */
public class T77 {
    public static void main(String[] args) {

        int [] array=new int[5];
        Scanner qq=new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            array[i]= qq.nextInt();
        }
        System.out.println("Output");

        for ( int i = 4; i >= 0; i-- ){
            System.out.println(array[i]);
        }

    }
}
