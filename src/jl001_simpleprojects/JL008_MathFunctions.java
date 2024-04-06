package jl001_simpleprojects; // Package declaration

import java.util.ArrayList;
import java.util.List;
import java.util.Random; // Import Random class
import java.util.Scanner;

public class JL008_MathFunctions { // Class declaration
    public static void main(String[] args) { // Main method declaration
        List<Integer> numbers = new ArrayList<Integer>(); // Create a list to store integers
        Random random = new Random(); // Create a Random object to generate random numbers

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(10)); // Generate a random integer between 0 and 9 and add it to the list
        }

        numbers.forEach(System.out::println); // Print out the numbers in the list
        System.out.println("Max number: " + numbers.stream().reduce(Integer.MIN_VALUE, Integer::max)); // Print the maximum number in the list
    }
}
