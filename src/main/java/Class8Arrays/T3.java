package Class8Arrays;

public class T3 {
    public static void main(String[] args) {
        //to count how many numbers are divisible by 5
        //and how many are divisible by 2
        int [] numbers={101,100,25,30,25,50,300};
        int div5=0;
        int div2=0;
        for(int n:numbers ){
            if(n%5==0 ) {
                div5 = div5 + 1;
            }if(n%2==0){
                div2=div2+1;
            }

        }
        System.out.println("DIvisible by 2 "+div2);
        System.out.println("Divisible by 5 "+div5);
    }
}
