package Class11;

public class E9StringDemo {
    public static void main(String[] args) {
        String str="Today is Saturday";
        //to substract piece of string (begining index,end index)
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(6,8));
        System.out.println(str.substring(9,str.length()));
        String str2="Java is Fun";
        System.out.println(str2.substring(0,4));
    }
}
