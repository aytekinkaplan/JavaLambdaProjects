package jl004_streamprojects;

import java.util.stream.IntStream;

public class JavaStreamsAPI003 {
    public static void main(String[] args) {
        // Create an infinite IntStream starting from 1 and limit it to the first 10 elements
        IntStream stream = IntStream.iterate(1, i -> i + 1).limit(10);
        // Print each element to the console
        stream.forEach(System.out::println);

        // Create an infinite IntStream starting from 1 and limit it to the first 10 elements
        // Square each element and print to the console
        IntStream stream2 = IntStream.iterate(1, i -> i + 1).limit(10).map(x -> x * x);
        stream2.forEach(System.out::println);

        // Create an infinite IntStream starting from 1 and limit it to the first 10 elements
        // Square each element, filter only the even ones, and print to the console
        IntStream stream3 = IntStream.iterate(1, i -> i + 1).limit(10).map(x -> x * x).filter(x -> x % 2 == 0);
        stream3.forEach(System.out::println);
    }
}
