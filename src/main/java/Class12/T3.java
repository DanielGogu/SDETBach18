package Class12;
//find out how many sentences are in tha String
public class T3 {
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining? Do we have a Java CLass today?";
        String[] aArray=a.split("[?]");
        System.out.println(aArray.length);
    }
}
