package ReplitTasks;
/*
Write a program to double the values of every element in the array and print it out.*/
public class T80 {
    public static void main(String[] args) {
        double[][] array={
                {2.8 ,4.0 ,6.6 ,4.0},
                {8.0 ,3.0 ,12.2 ,2.0 },
                {2.4 ,6.2 ,8.0 ,3.2}
        };
        for (double[] i : array) {
            System.out.println();
            for (double v : i) {
                v=v*2;
                System.out.print(v+" ");

            }

        }

    }
}
