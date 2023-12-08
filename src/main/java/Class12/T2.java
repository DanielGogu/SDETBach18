package Class12;
//find the lenght of the a-zA-Z
public class T2 {
    public static void main(String[] args) {
        String str="How @#@$nice LHFAL 65431 $@#%@";
        System.out.println(str.replaceAll("[^a-zA-Z]","").length());
    }
}
