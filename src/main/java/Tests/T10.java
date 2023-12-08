package Tests;

public class T10 {
    public static void main(String[] args) {


        int[] array = {66654, 66654,3213, 231, -51, 64, 6487,64,66654, 13, 43, 354};
        int l = array[0];
        int sl = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>l){
                sl=l;
                l=array[i];
            } else if (array[i]>sl&&array[i]!=l) {
                sl=array[i];
            }
        }
        System.out.println("second larger is "+sl);
    }

}
