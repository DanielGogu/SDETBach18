package Tests;

public class T7 {
    public static void main(String[] args) {
        int [] array={651,615,6416,13,32137,676,678};
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i]==13){
                array[i]=50;
            }
            System.out.print(array[i]+" ");

        }
        System.out.println();
        double plusInfinity=1.0/0.0;
        plusInfinity=(int)plusInfinity;
        System.out.println(plusInfinity);
    }



}
