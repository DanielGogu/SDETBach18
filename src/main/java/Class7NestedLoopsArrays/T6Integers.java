package Class7NestedLoopsArrays;
//Create an array of integers and summ all elements in it
public class T6Integers {
    public static void main(String[] args) {
        int [] numbers={12,65,84,126,-54,64,-6,354};//8
        int sum=0;
        for(int i=0;i< numbers.length;i++){
            sum=sum+numbers[i];

        }
        System.out.println("The sum is "+sum);
    }
}
