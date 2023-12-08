package ReplitTasks;

import java.util.Scanner;

/*Create an int array of integers with a size of 5 and input values with Scanner.
1,2,3,4,5
Don't print prompt questions for a user.
Using loop print out each element of the array that should look like the output below
10,20,30,40,50
 */
public class T78 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        int[] array=new int[5];

        for (int i = 0; i<5; i++){
            array[i]= qq.nextInt();
            System.out.println();
        }
        System.out.println("Output");
        for(int i=0 ; i<5; i++){
            System.out.println(array[i]*10);
            System.out.println();
        }

    }
}
