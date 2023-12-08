package Class4Scanner;

import java.util.Scanner;

/*You are DMV representative and you need to ask customer their age.
 If they are 18 or older you will issue a driver license to them,
 otherwise you will offer them to get a learners permit.
 */

public class Ta2Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner ab=new Scanner(System.in);
        int age=ab.nextInt();

        if (age>=18){
            System.out.println("Here's your driver license");
        }else {
            System.out.println("Get a learners permit");
        }

    }
}
