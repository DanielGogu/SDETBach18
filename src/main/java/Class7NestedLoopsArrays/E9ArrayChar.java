package Class7NestedLoopsArrays;

public class E9ArrayChar {
    public static void main(String[] args) {
        char[] gender = new char[3]; //maximum store 4 items
        gender[0] = 'F';
        gender[1] = 'M';
        gender[2] = '0';
        // gender[3]='D'; >> Error as capacity is reached
        System.out.println(gender[1]);
        System.out.println((gender[0])+(gender[1])+(gender[2]));
    }
}
