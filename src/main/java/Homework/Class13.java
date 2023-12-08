package Homework;

public class Class13 {
    /*Write a method to return whether
    given number is prime or not?
     */
    void isItPrime(int num){

        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                System.out.println("The number "+num+" is not prime");
                break;
            }else {
                System.out.println("The number "+num+" is prime");
            }

        }
    }
}
