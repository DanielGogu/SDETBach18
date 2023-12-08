package Class9Arrays2D;

public class E2 {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        //we can split 2D Arrays into 1D Arrays
        int [] row0=matrix[0];
        System.out.println(row0[0]);// 10
        System.out.println(row0[2]);// 50
        int [] row=matrix[2];
        System.out.println(row[2]); //78
        for (int i=0; i< row.length;i++){
            System.out.print(row[i]+" ");
        }

    }

}
