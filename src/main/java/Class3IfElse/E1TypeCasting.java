package Class3IfElse;

public class E1TypeCasting {
    public static void main(String[] args) {

        int age=10;
        System.out.println(age);
        //moving from a smaller int box to a larger double box
        //thats why no issues
        double age2=age;
        System.out.println(age2);
        //that won't do it untill we force it with (int)
        //manual narrowing
        double largeBox=10.5;
        int smallBox=(int)largeBox;
        System.out.println(smallBox);
        short mediumBox=1300;
        byte smallestBox=(byte)mediumBox;
        System.out.println(smallestBox);



    }
}
