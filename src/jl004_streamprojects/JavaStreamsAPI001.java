package jl004_streamprojects;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaStreamsAPI001 {
    public static void main(String[] args) {
        IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5});//IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(System.out::println);

        IntStream stream1 = IntStream.rangeClosed(1, 10);
        stream1.forEach(System.out::println);

        IntStream stream2 = IntStream.range(1, 10);
        stream2.forEach(System.out::println);

        IntStream stream3 = IntStream.range(1, 10).map(x -> x * x);
        stream3.forEach(System.out::println);

        IntStream stream4 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0);
        stream4.forEach(System.out::println);

        IntStream stream5 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).limit(5);
        stream5.forEach(System.out::println);

        IntStream stream6 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).skip(5);
        stream6.forEach(System.out::println);

        IntStream stream7 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).limit(5).skip(5);
        stream7.forEach(System.out::println);

        IntStream stream8 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).skip(5).limit(5);
        stream8.forEach(System.out::println);

        IntStream stream9 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).limit(5).skip(5).limit(5);
        stream9.forEach(System.out::println);

        IntStream stream10 = IntStream.range(1, 10).map(x -> x * x).filter(x -> x % 2 == 0).skip(5).limit(5).skip(5);
        stream10.forEach(System.out::println);
    }
}
