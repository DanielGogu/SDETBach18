package Class9Arrays2D;

public class T1SumAllSumEachRow {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        int sumOfAll=0;

        for( int row = 0; row < matrix.length; row++){
                // add sumOfAll=; To reset the value and calculate each rows sum
            for( int col = 0; col < matrix[row].length ; col++){
                System.out.print(matrix[row][col]+" ");
                sumOfAll=sumOfAll+matrix[row][col];


            }
        }
        System.out.println();
        System.out.println("The sum of all elements is "+sumOfAll);
    }
}
