package Class7NestedLoopsArrays;

public class E12Arrays {
    public static void main(String[] args) {
        //this is how we can count the size of the array
        int [] numbers={10,20,30,45,69,55,45,69,20};
        System.out.println(numbers.length);
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]==55){
                System.out.println("Found");
                //apply the break on if to stop the loop
                break;
            }

        }
    }
}
