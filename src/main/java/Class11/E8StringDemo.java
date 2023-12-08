package Class11;

public class E8StringDemo {
    public static void main(String[] args) {
        String str="Today is Saturday";
        System.out.println(str.indexOf('T'));//0
        System.out.println(str.indexOf('o'));//1
        System.out.println(str.indexOf('a'));//index of the first letter
        System.out.println(str.indexOf('z'));//-1
        int index=0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){

                System.out.println("'a' present at index "+i);
            }
        }
    }
}
