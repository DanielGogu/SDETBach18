package Tests;

public class T3StringComparison {
    public static void main(String[] args) {
        String a="banana";
        String b="banana";
        String c="apple";
        String d="apple";

        if(a==b&&c==d){
            System.out.println("Equal");
        }else {
            System.out.println("not equal");
        }
    }
}
