package jl001_simpleprojects; // Package declaration

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JL009_MathFunctions { // Class declaration
    public static void main(String[] args) { // Main method declaration
        List<Integer> numbers = new ArrayList<Integer>(); // Create a list to store integers
        Random random = new Random(); // Create a Random object to generate random numbers

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(10)); // Generate a random integer between 0 and 9 and add it to the list
        }

        numbers.forEach(System.out::println); // Print out the numbers in the list

        // Find the minimum number in the list
        int minNumber = numbers.stream()
                .reduce(Integer.MAX_VALUE, Integer::min); // Use Integer::min as the binary operator

        // Check if the list is not empty
        if (numbers.isEmpty()) {
            System.out.println("The list is empty."); // Print a message if the list is empty
        } else {
            System.out.println("Min number: " + minNumber); // Print the minimum number in the list
        }
    }
}
