package Class12;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner qq = new Scanner(System.in);
        System.out.print("Enter Mom's first name ");
        String mothersName= qq.next();
        System.out.print("Enter Dad's first name ");
        String fathersName=qq.next();
        System.out.print("Is it a boy false/true ");
        Boolean isBoy=qq.nextBoolean();

        if(!isBoy){
            System.out.println(mothersName.substring(0,mothersName.length()/2)+fathersName.substring(fathersName.length()/2,fathersName.length()));
        } else if (isBoy) {
            System.out.println(fathersName.substring(0,fathersName.length()/2)+mothersName.substring(mothersName.length()/2,mothersName.length()));
        }


    }
    }
