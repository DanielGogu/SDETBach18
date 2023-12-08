package Class7NestedLoopsArrays;
/*Create an array of animals and store 5 animals into it.
 Using 2 different loops print all elements from the array.
 */
public class T5Animals {
    public static void main(String[] args) {
        String [] animals={"Dog","Hen","Cow","Cat","Pig"};

        for(int i=0; i<animals.length;i++){
            System.out.print(animals[i]+" ");
        }
        System.out.println();
        int j=0;
        while (j< animals.length){
            System.out.print(animals[j]+" ");
            j++;
        }

    }
}
