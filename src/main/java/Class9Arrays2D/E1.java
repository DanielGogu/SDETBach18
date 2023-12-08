package Class9Arrays2D;

public class E1 {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        System.out.println(matrix[1][1]); //35
        System.out.println(matrix[0][2]); //50
        System.out.println(matrix[3][2]); //66
        //System.out.println(matrix[0][3]); //error
        System.out.println(matrix.length); // Gives the number of rows = 4
        System.out.println(matrix[0].length); //Gives the number of colons in that row
    }
}
