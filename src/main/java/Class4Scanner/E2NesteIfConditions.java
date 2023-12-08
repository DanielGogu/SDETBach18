package Class4Scanner;

public class E2NesteIfConditions {
    public static void main(String[] args) {
        double budget=25000;
        String engineType="Petrol";
        if (budget>=50000){

            if (engineType.equals("Electric")){
                System.out.println("I want to buy a Tesla!");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy a Toyota!");

            }else{
                System.out.println("I want to buy a Porche!");
            }
        } else if (budget>=30000) {
            if (engineType.equals("Electric")){
                System.out.println("I want to buy a BYD!");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy a Camry!");
            } else {
                System.out.println("I want to buy a Hyundai Sonata!");
            }

        } else if (budget>=20000) {
            if (engineType.equals("Electric")){
                System.out.println("I will buy a Nissan Leaf!");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I will buy a Kia!");
            }else {
                System.out.println("I will buy a Honda Civic!");
            }

        }else {
            System.out.println("Lets save more!");
        }
    }
}
