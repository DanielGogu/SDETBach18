package Class8Arrays;

public class T5Plus {
    public static void main(String[] args) {


        int[] numbers = {10, 15, 20, 18, 9, 60, 22, 30};
        //int [] numbers1={9,10,15,18,20,22,30,60};
        //make it a sorted array
        boolean isSorted = true;
        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i]>numbers[i+1]){
                isSorted=false;
                break;
            }
        }
        System.out.println("Is this array sorted? "+isSorted);
    }

}