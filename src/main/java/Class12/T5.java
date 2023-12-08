package Class12;
//Reverse a String word by word 
//This is sentence I want to reverse
public class T5 {
    public static void main(String[] args) {
        String str="This is sentence I want to reverse";
        String [] splitStr=str.split(" ");

        for (int i = 0; i < splitStr.length; i++) {
            for (int j = splitStr[i].length()-1; j >=0 ; j--) {
                System.out.print(splitStr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
