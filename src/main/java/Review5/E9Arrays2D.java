package Review5;

public class E9Arrays2D {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,40},
                {20,40,60,80,100},
                {30,60,90}
        };
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
