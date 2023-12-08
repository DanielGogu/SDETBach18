package ReplitTasks;
/*
Write a program that sums all numbers that are on even index and on even row.*/
public class T85 {
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4},
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int sumOfEvenIndexes=0;
        for (int i = 0; i < a.length ; i++) {
            if(i%2!=0){
                sumOfEvenIndexes=0;
                System.out.println("Sum of indexes on the odd row number "+i+" is");
                for (int j = 0; j <a[i].length ; j++) {
                    if (j%2!=0){
                        sumOfEvenIndexes=sumOfEvenIndexes+a[i][j];
                    }
                }
                System.out.println(sumOfEvenIndexes);
            }
        }


    }
}
