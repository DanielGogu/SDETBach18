package Class8Arrays;

public class E2ContinueOddNum {
    public static void main(String[] args) {
        int [] numbers={10,45,12,47,20,30};
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]%2!=0){
                //to skip the rest of the code
                continue;
            }
            System.out.println(numbers[i]);
        }
    }
}
