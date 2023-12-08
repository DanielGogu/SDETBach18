package Class9Arrays2D;
/* 2D Arrays : Veggies,fruits,dairy and sweets>>Tomato,Apple,milk,Chocolate*/
public class T4 {
    public static void main(String[] args) {
        String[][] arr = {
                {"Veggies", "Fruits", "Dairy", "Sweets"},
                {"Tomato","Apple","Milk","Chocolate"}
        };
        for(int i =0; i<arr[0].length; i++){
            System.out.println("Product type is "+arr[0][i]+" and product is "+arr[1][i]);
        }
    }
}
