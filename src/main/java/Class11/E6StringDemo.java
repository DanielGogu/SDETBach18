package Class11;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Java is FUn";
        char c=str.charAt(0);
        System.out.println(c);//J
        c=str.charAt(4);
        System.out.println(c);//empty

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
