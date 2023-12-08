package ReplitTasks;
/*Write a program that will print the sum of all elements in 2D array. */
public class T82 {
    public static void main(String[] args) {
        double[][] array={
                {2.8 ,4.0 ,6.6 ,4.0},
                {8.0 ,3.0 ,12.2 ,2.0 },
                {2.4 ,6.2 ,8.0 ,3.2}
        };
        double sumOfAll=0;
        for (double[] i : array) {
            for (double v : i) {
                sumOfAll=sumOfAll+v;
            }
        }
        System.out.println("The sum of all elements in the array is "+sumOfAll);
    }
}
