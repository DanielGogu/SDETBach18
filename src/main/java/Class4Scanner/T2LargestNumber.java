package Class4Scanner;

public class T2LargestNumber {
    public static void main(String[] args) {

        double num1=54;
        double num2=5464;
        double num3=464;

        if(num1>num2){
            if (num1>num3){
                System.out.println("Number 1 is the largest! "+num1);
            }
        } else {
            if(num2>num3){
                System.out.println("Number 2 is the largest! "+num2);
            }else {
                System.out.println("Number 3 is the largest! "+num3);
            }
        }

    }
}
