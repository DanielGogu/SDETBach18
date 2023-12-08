package Tests;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class T11 {
    public static void main(String[] args) {
        int [][] twoDArray={
                {-654,321,48,32,9},
                {3,84,-31,87},
                {264,989,-359,64,189,74},
                {6546,31,847,7,64}
        };
        int[] array = Stream.of(twoDArray).flatMapToInt(IntStream::of).toArray();
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }
}
