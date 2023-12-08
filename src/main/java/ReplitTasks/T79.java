package ReplitTasks;

/*Write a program to print values from a 2D array*/
public class T79 {
    public static void main(String[] args) {
        double [][]array={
            {1.4, 2.0, 3.3 ,2.0 },
            {4.0,1.5 ,6.1 ,1.0},
                {1.2 ,3.1 ,4.0, 1.6}
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }

    }
}
