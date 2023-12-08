package Homework;
/*
2.Create a Java program and store values of mortgage rate and mortgage price.
 First, program should check if rate is higher than 4.5 user will not buy a house,
  otherwise user will consider buying. Once user decides to buy a house,
  if price of the house is larger than 100,000 than user will take a loan,
  otherwise user will pay cash.
 */
public class T2 {
    public static void main(String[] args) {

        double mortageRate=5;
        int mortagePrice=150000;

        if (mortageRate<=4.5){
            System.out.println("I will consider buying!");
            if (mortagePrice>100000){
                System.out.println("I will take a loan!");
            }else {
                System.out.println("I will pay cash!");
            }
        }else {
            System.out.println("I will not buy a house!");
        }

    }
}
