package Class11;

public class E1StringDemo {
    public static void main(String[] args) {
        // Create the object of that class
        /*
        String => Data type
        str => variable name
        new String() => creating the object of String
         */
        String str=new String("Hello world");
        str.length();
        //calling the lenght method using the str object
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
        System.out.println(str+"Hello Batch 18");
    }
}
