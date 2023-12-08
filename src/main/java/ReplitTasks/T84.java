package ReplitTasks;
/*Write a program that prints the total number of elements that are negative AND odd*/
public class T84 {
    public static void main(String[] args) {
        int[][] array = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        System.out.println("The elements that are Negative and Odd are");
        for (int[] i : array) {
            for (int i1 : i) {
                if (i1<0&&i1%2!=0){
                    System.out.print(" "+i1+" ");
                }
            }

        }

    }
}
