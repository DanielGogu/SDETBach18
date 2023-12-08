package Tests;

public class TString {
    public static void main(String[] args) {
        String test="IL654";
        String sumOfTest="";

        for (int i = 0; i < 5; i++) {
            sumOfTest=sumOfTest+test.charAt(i);
        }
        System.out.println(sumOfTest);
    }
}
