package Class7NestedLoopsArrays;
/*Create an array to store char values and then print those
in reverse order
 */

public class T8CharReverse {
    public static void main(String[] args) {
        char [] letters={'A','B','C','D','E','F','G'};
        //7
        for(int i=6;(i>=0&&i<letters.length);i--){
            System.out.print(" "+letters[i]);
        }
    }
}
