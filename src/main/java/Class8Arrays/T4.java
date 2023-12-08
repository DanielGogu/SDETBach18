package Class8Arrays;

public class T4 {
    public static void main(String[] args) {
        int [] numbers={10,15,20,18,9,60,22,30};
        // show the sum of even numbers and odd numbers separately
        int evenSum=0,oddSum=0;
        for(int n:numbers){
            if(n%2==0){
                evenSum=evenSum+n;
            }else {
                oddSum=oddSum+n;
            }
        }
        System.out.println("THe sum of even numbers is "+evenSum);
        System.out.println("THe sum of odd numbers is "+oddSum);

    }
}
