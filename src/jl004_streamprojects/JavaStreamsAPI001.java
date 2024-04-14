package jl004_streamprojects;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaStreamsAPI001 {
    public static void main(String[] args) {
        IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5});//IntStream stream = IntStream.of(1, 2, 3, 4, 5);
// Creates an IntStream from an array of integers containing elements 1, 2, 3, 4, and 5.

        IntStream stream1 = IntStream.rangeClosed(1, 10);
// Creates an IntStream with integers from 1 to 10, inclusive.

        IntStream stream2 = IntStream.range(1, 10);
// Creates an IntStream with integers from 1 to 9 (exclusive).

        IntStream stream3 = IntStream.range(1, 10).map(x -> x * x);
// Creates an IntStream with squares of integers from 1 to 9.

        IntStream stream4 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0);
// Creates an IntStream with squares of even integers from 1 to 9.

        IntStream stream5 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).limit(5);
// Creates an IntStream with the first 5 squares of even integers from 1 to 9.

        IntStream stream6 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).skip(5);
// Creates an IntStream with squares of even integers from 1 to 9, skipping the first 5 elements.

        IntStream stream7 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).limit(5).skip(5);
// Creates an IntStream with the 6th to 10th squares of even integers from 1 to 9.

        IntStream stream8 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).skip(5).limit(5);
// Creates an IntStream with the 6th to 10th squares of even integers from 1 to 9.

        IntStream stream9 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).limit(5).skip(5).limit(5);
// Creates an IntStream with no elements since the limit is applied after the skip operation.

        IntStream stream10 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).skip(5).limit(5).skip(5);
// Creates an IntStream with no elements since the skip operation is applied after the limit operation.

    }
}
