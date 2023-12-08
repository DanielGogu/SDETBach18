package Class5LogicalOperators;

import java.util.Scanner;

public class TSwitch1 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.print("Please enter the country ");
        String Country=qq.nextLine();
        switch (Country){
            case "USA":
                System.out.println("Language spoken is English");
            break;
            case "Moldova":
                System.out.println("Language spoken is Romenian");
            break;
            case "Italy":
                System.out.println("Language spoken is Italian");
            break;
            case "Germany":
                System.out.println("Language spoken is German");
            break;
            case "France":
                System.out.println("Language spoken is French");
            break;
            default:
                System.out.println("Invalid Country");
        }
    }
}
