package Class13;
/*
create a method and print the results
 */
public class Math {

    void add(int input1,int input2){
        System.out.println(input1+input2);
    }

    int multiply(int num1,int num2){

        return num1*num2;
    }
    void isLargest(double num1,double num2){
        if(num1>num2){
            System.out.println("Number "+num1+" is the largest");
        }else {
            System.out.println("Number "+num2+" is the largest");
        }
    }
    void isItEvenOrOdd(int num){
        if(num%2==0){
            System.out.println("The number "+num+" is even");
        }else {
            System.out.println("The number "+num+" is odd");
        }
    }
    void isPalindrome(String word){
        String reversedWord="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversedWord=reversedWord+word.charAt(i);
        }
        if(word.equalsIgnoreCase(reversedWord)){
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("It's not a Palindrome");
        }

    }
    void sayHello5Languages(String country){
        if(country.equalsIgnoreCase("Italy")){
            System.out.println("The language is italian");
        }else if(country.equalsIgnoreCase("Brasil")){
            System.out.println("The language is portuges");
        }else if(country.equalsIgnoreCase("Germany")){
            System.out.println("The language is german");
        }else if(country.equalsIgnoreCase("USA")){
            System.out.println("The language is english");
        }else if(country.equalsIgnoreCase("France")){
            System.out.println("The language is french");
        }else {
            System.out.println("The country "+country+" is an invalid country");
        }
    }
}
