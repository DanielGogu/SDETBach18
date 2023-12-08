package Review5;

public class E3Arrays {
    public static void main(String[] args) {
        int [] numbers={10,25,36,56,80,50,60};
        //Print numbers on even indexes

        for (int i = 0 ; i < numbers.length; i=i+2){
            System.out.print(numbers[i]+" ");

        }
    }
}
