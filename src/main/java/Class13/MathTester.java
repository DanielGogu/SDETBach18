package Class13;

public class MathTester {
    public static void main(String[] args) {
        Math obj=new Math();

        obj.add(10,10);

        int result=obj.multiply(10,2);
        System.out.println(result);

        obj.isLargest(64565,-5463.6);

        obj.isItEvenOrOdd(16);

        obj.isPalindrome("aba");

        obj.sayHello5Languages("USa");
    }

}
