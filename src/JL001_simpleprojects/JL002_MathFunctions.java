package JL001_simpleprojects; // Package declaration

import java.util.ArrayList; // Import ArrayList class
import java.util.List; // Import List interface
import java.util.Scanner; // Import Scanner class

public class JL002_MathFunctions { // Class declaration
    public static void main(String[] args) { // Main method declaration
        List<Integer> numbers = new ArrayList<Integer>(); // Create a list to store integers
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Loop to prompt the user to enter 10 numbers and add them to the list
        for (int i = 0; i <= 9; i++) {
            System.out.println("Please enter your " + (i + 1) + "th number: "); // Prompt the user for input
            numbers.add(scanner.nextInt()); // Read the input number and add it to the list
        }

        numbers.forEach(System.out::println); // Print out the entered numbers

        // Calculate and print the sum of all the entered numbers using Java 8 stream API
        System.out.println(numbers.stream().reduce(0, Integer::sum));
    }
}
