package Class4Scanner;

public class E1NestedIfConditions {
    public static void main(String[] args) {
        boolean isMainDoorOpened=false;
        boolean isRoom10opened=true;
        boolean isRoom20opened=true;
        if (isMainDoorOpened){
            System.out.println("Main door is open!");
            if (isRoom10opened){
                System.out.println("We are in room 1!");
            }else {
                System.out.println("Room 1 is closed");
            }
            if (isRoom20opened){
                System.out.println("We are in room 2");
            }else {
                System.out.println("Room 2 is closed");
            }
        }else {
            System.out.println("Can't Enter the house main door is closed!");
        }
    }
}
