package Class9Arrays2D;
/*Create 2d array of cars : american,german,korean,italian.
Retrieve all values using 2 different loops
 */
public class T3 {
    public static void main(String[] args) {

        String[][] arr = {
                {"Chevrolet", "Ford", "Dodge"},
                {"Mercedes","BMW","WW"},
                {"FIat","Ferrari","Lamborghini"},
                {"KIA","Hyundai"}
        };
        System.out.println("Using normal FOr");
        System.out.println();

        for(int i=0;i< arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Using Enchanced Loop");
        System.out.println();
        for (String[] arrr:arr){
            for (String car:arrr){
                System.out.print(car+" ");
            }
            System.out.println();
        }



        }
    }
