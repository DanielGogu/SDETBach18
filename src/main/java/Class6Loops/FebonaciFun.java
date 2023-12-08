package Class6Loops;

public class FebonaciFun {
    public static void main(String[] args) {
        int num1=0,num2=1;
        for(int i=1;i<=15;i++){
            System.out.print(num1+" ");
            int sumOfTwo=num1+num2;
            num1=num2;
            num2=sumOfTwo;
        }
    }
}
