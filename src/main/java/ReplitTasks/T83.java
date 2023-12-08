package ReplitTasks;

import java.util.Arrays;

/*Write a program that calculates the sum of elements
from each row in a 2D array and adds them into array of integers
 */
public class T83 {
    public static void main(String[] args) {
        int [][] array={
                {1,1,2}, //4
                {3,1,2}, //6
                {3,5,3}, //11
                {0,1,2}  //3
        };
        int sumOfRows=0;
        int [] rowsSum=new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                sumOfRows=sumOfRows+array[i][j];
            }
            rowsSum[i]=sumOfRows;
            sumOfRows=0;
        }
        System.out.println(Arrays.toString(rowsSum));

    }
}
