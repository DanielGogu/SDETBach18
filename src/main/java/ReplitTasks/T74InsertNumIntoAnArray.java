package ReplitTasks;
/*Write a program that creates an array of integers of size 11.
 Add the years 2010 to 2020 to your array one by one using
 a for loop and then print all those values.
 */
public class T74InsertNumIntoAnArray {
    public static void main(String[] args) {
        int[] array=new int[11];
        int year=2010;
        for(int i = 0; i < 11; i++ ){
            array[i]=year+i;
            System.out.print(array[i]+" ");
        }
    }
}
