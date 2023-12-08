package Class4Scanner;

import java.util.Scanner;

public class Ta3Scanner {
    public static void main(String[] args) {
        System.out.println("Enter the City name");
        Scanner sc=new Scanner(System.in);
        String city=sc.nextLine();
        System.out.println("Enter the temperature");
        Scanner sc1=new Scanner(System.in);
        double temperatureF=sc1.nextDouble();
        double temperatureC=(temperatureF-32)*5/9;
        System.out.println("The temperature in the city "+city+" is "+temperatureC);



    }
}
