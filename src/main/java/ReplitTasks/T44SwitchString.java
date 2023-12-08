package ReplitTasks;

import java.util.Scanner;

/*Prompt user with questions: "Please enter your favorite car mark"
- if user enters  BMW -->  carOrigin = "german car"
- if user enters  Toyota -->  carOrigin = " japanese car"
- if user enters  Maserati -->  carOrigin = "italian car"
- anything else besides those values --> carOrigin = "unknown"
The output of your program should be:
"Your favorite car is ___"
*/
public class T44SwitchString {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please enter your favorite car mark");
        String car=qq.nextLine();
        String carOrigin="unknown";
        switch (car){
            case "BMW":
                carOrigin = "german car";
                break;
            case "Toyota":
                carOrigin="japanese car";
                break;
            case "Maserati":
                carOrigin="italian car";
                break;
            default:
                carOrigin="unknown";
        }
        System.out.println("Your favourite car is a "+carOrigin);
    }

}
