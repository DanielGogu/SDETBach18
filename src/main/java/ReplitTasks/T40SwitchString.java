package ReplitTasks;

import java.util.Scanner;

public class T40SwitchString {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Enter name of the instructor");
        String iName=qq.nextLine();
        switch (iName){
            case "Asghar":
                System.out.println("Will take care of the java assignment");
                break;
            case "Moazzam":
                System.out.println("Will take care of SDLC assignment");
                break;
            case "Weqas":
                System.out.println("Will take care of Selenium assignment");
                break;
            case "Asel":
                System.out.println("Will take care of of every Assignment");
                break;
            default:
                System.out.println("Invalid instructor selected");
        }
    }

}
