package Class11;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please eneter username");
        String userName=qq.next();
        System.out.println("Please eneter password");
        String password=qq.next();
        System.out.println("Please repeate password");
        String confirmPassword=qq.next();
        userName.trim();
        password.trim();
        confirmPassword.trim();
        if (userName.isEmpty()||password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");
        } else if (password.contains(userName)) {
            System.out.println("Password cannot contain username");
        } else if(!password.equals(confirmPassword)){
        System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password have been created");
        }

    }
}
