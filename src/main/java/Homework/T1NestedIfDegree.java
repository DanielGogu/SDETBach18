package Homework;
/*
1.Write a program to store a value whether user has degree or not.
 If user has a degree, you should say congratulations and after
  that check  If gpa score is higher or equals to 3.5 → output should
  say “You are eligible for scholarship”, otherwise → “You should have studied harder”
   . if user does not have a degree print you should get a degree
 */


public class T1NestedIfDegree {
    public static void main(String[] args) {
        boolean degree=false;
        double gpa=2;
        if (degree){
            System.out.println("Congratulations you have a degree!");
            if (gpa>=3.5) {
                System.out.println("You are eligible for scholarship!");
            }else {
                System.out.println("But you should have studied harder!");
            }
        }else {
            System.out.println("You should get a degree!");
        }

    }
}
