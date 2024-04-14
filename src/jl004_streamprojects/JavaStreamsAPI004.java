package jl004_streamprojects;

import java.util.Random;
import java.util.stream.IntStream;

public class JavaStreamsAPI004 {
    public static void main(String[] args) {
        // Generate an infinite IntStream with random integers less than 100, and limit it to the first 10 elements
        IntStream stream = IntStream.generate(() -> new Random().nextInt(100));
        stream.limit(10).forEach(System.out::println);

        // Generate an infinite IntStream with random integers less than 100, and limit it to the first 10 elements
        IntStream stream2 = IntStream.generate(() -> new Random().nextInt(100)).limit(10);
        stream2.forEach(System.out::println);
    }
}
