package jl004_streamprojects;

import java.util.stream.IntStream;

public class JavaStreamsAPI002 {
    public static void main(String[] args) {
        // Create an IntStream containing integers from 1 to 10
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Print each element using forEach
        stream.forEach(System.out::println);

        // Create an IntStream containing integers from 1 to 10
        // Filter out only the even numbers using filter
        IntStream streamFiltered = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x -> x % 2 == 0);
        // Print each filtered element using forEach
        streamFiltered.forEach(System.out::println);

        // Create an IntStream containing integers from 1 to 10
        // Double each element using map
        IntStream streamMap = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(x -> x * 2);
        // Print each mapped element using forEach
        streamMap.forEach(System.out::println);

        // Create an IntStream containing integers from 1 to 10
        // Reduce the stream to calculate the sum
        IntStream streamReduce = IntStream.of(IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce(0, Integer::sum));
        // Print the reduced sum using forEach
        streamReduce.forEach(System.out::println);

        // Create an IntStream containing integers from 1 to 10
        // Perform parallel reduction to calculate the sum
        IntStream streamReduce2 = IntStream.of(IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallel().reduce(0, Integer::sum));
        // Print the reduced sum using forEach
        streamReduce2.forEach(System.out::println);
    }
}
