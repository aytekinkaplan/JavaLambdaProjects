package jl002_simpleprojects;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JL008_Strings {
    public static void main(String[] args) {
        // Creating a list of words
        List<String> words = Arrays.asList("hi", "hello", "hola", "bonjour", "bye", "goodbye", "adios", "auvoir");

        // Printing all the words in the list
        words.forEach(System.out::println);

        // Printing all the words in the list in uppercase
        words.stream().map(String::toUpperCase).forEach(System.out::println);

        // Printing all the words in the list with exclamation marks
        words.stream().map(w -> w + "!").forEach(System.out::println);

        // Printing all the words in the list with "i" replaced with "I"
        words.stream().map(w -> w.replace("i", "I")).forEach(System.out::println);

        // Printing all the words in the list with "i" replaced with "I" and in uppercase
        words.stream().map(w -> w.replace("i", "I").toUpperCase()).forEach(System.out::println);

        // Printing all the words in the list with length greater than 4
        words.stream().filter(w -> w.length() > 4).forEach(System.out::println);

        // Printing all the words in the list with length greater than 4 and in uppercase
        words.stream().filter(w -> w.length() > 4).map(String::toUpperCase).forEach(System.out::println);

        // Printing all the words in the list with length less than 4
        words.stream().filter(w -> w.length() < 4).forEach(System.out::println);

        // Printing all the words in the list with length less than 4 and in uppercase
        words.stream().filter(w -> w.length() < 4).map(String::toUpperCase).forEach(System.out::println);

        // Printing all the words in the list with length greater than 4 or less than 4
        words.stream().filter(w -> w.length() > 4 || w.length() < 4).forEach(System.out::println);

        // Printing all the words in the list with length greater than 4 or less than 4 and in uppercase
        words.stream().filter(w -> w.length() > 4 || w.length() < 4).map(String::toUpperCase).forEach(System.out::println);

        // Printing all the words in the list that contain the letter "b"
        words.stream().filter(w -> w.contains("b")).forEach(System.out::println);

        // Printing all the words in the list that contain the letter "b" and in uppercase
        words.stream().map(w -> w.contains("b") ? "TRUE" : "FALSE").map(String::toUpperCase).forEach(System.out::println);

        // Printing all the words in the list that have an even length
        words.stream().filter(w -> w.length() % 2 == 0).forEach(System.out::println);

        // Printing all the words in the list that have length less than 4 and contain the letter "e" in uppercase
        words.stream().filter(w -> w.length() < 4).filter(w -> w.contains("e")).map(String::toUpperCase).forEach(System.out::println);

        // Finding the first word in the list that has length less than 4 and contains the letter "e" in uppercase
        Optional<String> firstMatch = words.stream().filter(w -> w.length() < 4).filter(w -> w.contains("e")).map(String::toUpperCase).findFirst();
        System.out.println(firstMatch.orElse("No match found"));

        // Concatenating all the words in the list into a single string, separated by spaces, and in uppercase
        Optional<String> concatenated = words.stream().reduce((a, b) -> a.toUpperCase() + " " + b.toUpperCase());
        concatenated.ifPresent(System.out::println);

        // Concatenating all the words in the list into a single string, separated by commas
        Optional<String> withCommas = words.stream().reduce((a, b) -> a + "," + b);
        withCommas.ifPresent(System.out::println);

        // Calculating the sum of all numbers in a list
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        int sum = nums.stream().reduce(Integer::sum).orElse(0);
        System.out.println("Sum: " + sum);

        // Calculating the sum of all numbers in a list in parallel
        int parallelSum = nums.stream().parallel().reduce(Integer::sum).orElse(0);
        System.out.println("Parallel Sum: " + parallelSum);

        // Calculating the product of all numbers in a list
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        double product = doubles.stream().reduce((x, y) -> x * y).orElse(1.0);
        System.out.println("Product: " + product);

        // Calculating the product of all numbers in a list in parallel
        double parallelProduct = doubles.stream().parallel().reduce((x, y) -> x * y).orElse(1.0);
        System.out.println("Parallel Product: " + parallelProduct);
    }
}
