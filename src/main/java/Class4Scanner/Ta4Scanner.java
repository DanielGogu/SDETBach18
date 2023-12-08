package Class4Scanner;
/*Create a Java program that will ask if user has a credit card or not.
 If you user does not have a credit card then offer them.
 If they do have one ask what is balance on the card?
 If balance of the card is larger than 1000, tell them to pay off immediately,
 otherwise you can tell them that they can spend more.
 */
import java.util.Scanner;

public class Ta4Scanner {
    public static void main(String[] args) {
        System.out.println("Do you have a Credit Card");
        Scanner sc=new Scanner(System.in);
        String card=sc.next();
        if (card.equals("No")){
            System.out.println("We can offer you one!");
        }else {
            System.out.println("What is the balance on the card?");
            int balance=sc.nextInt();
            if(balance>1000){
                System.out.println("Pay Off immediately!");
            }else {
                System.out.println("You can spend more!");
            }

        }

    }
}
