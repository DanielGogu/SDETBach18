package Review5;

public class E8Arrays2D {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,40},
                {20,40,60,80},
                {30,60,90,120}
        };
        //getting back to 1D Array from 2D Array
        int [] row0=numbers[0];
        //Getting back to individual number from 2D Array
        int num=numbers[0][0];
        System.out.println(num);
    }
}
