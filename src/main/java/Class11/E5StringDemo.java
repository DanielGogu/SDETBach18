package Class11;

public class E5StringDemo {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(str.equals("Python"));// false
        System.out.println(str.equals("Java"));// true
        System.out.println(str.equals("java"));// false
        // Ignoring the Upper or Lower case
        System.out.println(str.equalsIgnoreCase("java"));// true
    }
}
