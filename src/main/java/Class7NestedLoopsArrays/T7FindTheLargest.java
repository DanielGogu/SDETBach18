package Class7NestedLoopsArrays;

//From array of integers find the largest
public class T7FindTheLargest {
    public static void main(String[] args) {
        int [] numbers={-846,-5361,-21,-564,-654,-8,-645,-3133,-68476,-64,-67,-6468,-7,-987};
        System.out.println(numbers.length);//14
        double min=-1.0/0.0;
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]>min){
                min=numbers[i];

            }
        }
        System.out.println(min);
    }
}
