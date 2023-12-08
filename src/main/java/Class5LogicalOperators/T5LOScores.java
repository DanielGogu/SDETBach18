package Class5LogicalOperators;

import java.util.Scanner;
/*Write a program that will read three inputs of scores
(quiz, mid term, and final scores)
and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
*/
public class T5LOScores {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.print("Please Enter Quiz Score 0-100 ");
        double quiz= qq.nextDouble();
        System.out.print("Please enter Mid term Score 0-100 ");
        double midT= qq.nextDouble();
        System.out.print("Please enter Final Score 0-100 ");
        double finalS= qq.nextDouble();
        double aver=(quiz+midT+finalS)/3;
        String grade;
        if (aver>=90){
            grade="Your Grade=A";
        } else if (aver>=70) {
            grade="Your Grade=B";
        } else if (aver>=50){
            grade="Your Grade=C";
        } else  {
            grade="Your Grade=F";
        }
        System.out.println(grade);

    }
}
