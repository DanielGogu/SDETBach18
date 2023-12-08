package ReplitTasks;
/*Write a program that prints the highest value in the array.*/
public class T81 {
    public static void main(String[] args) {
        double[] array={5,4,8};
        double mInfinity=-1.0/0.0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i]>mInfinity){
                mInfinity=array[i];
            };
        }
        System.out.println("The Largest number is "+mInfinity);
    }
}
