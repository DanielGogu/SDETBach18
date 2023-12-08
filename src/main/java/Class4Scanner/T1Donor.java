package Class4Scanner;

public class T1Donor {
    public static void main(String[] args) {
        double age=16;
        double weight=111;

        if (age>=18) {
            if (weight > 110) {
                System.out.println("You are eligible for blood donation!");
            } else {
                System.out.println("You are not eligible for a blood donation!");
            }
        }else {
            System.out.println("We cannot accept such patient!");
        }
    }
}
