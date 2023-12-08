package Class9Arrays2D;

public class E4 {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        int [] row0=matrix[0]; //10,20,50
        System.out.println(row0.length); // 3
        for(int n:row0){
            System.out.print(n+" ");//10,20,50
        }
        System.out.println();
        System.out.println(matrix[2][2]);//78
    }
}
