package jl001_simpleprojects; // Package declaration

import java.util.ArrayList; // Import ArrayList class
import java.util.Scanner; // Import Scanner class

public class JL006_MathFunctions { // Class declaration
    public static void main(String[] args) { // Main method declaration
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // Create an ArrayList to store integers

        // Loop to prompt the user to enter 6 numbers and add them to the list
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter your " + (i + 1) + "th number: "); // Prompt the user for input
            numbers.add(scanner.nextInt()); // Read the input number and add it to the list
        }

        numbers.forEach(System.out::println); // Print out the entered numbers

        // Calculate and print the division of all the entered numbers
        // Check if the divisor is not zero before performing the division
        int result = numbers.stream()
                .skip(1) // Skip the first element as the initial value for division
                .reduce(numbers.getFirst(), (number1, number2) -> {
                    if (number2 != 0) {
                        return number1 / number2; // Perform division if the divisor is not zero
                    } else {
                        return number1; // Otherwise, return the previous result without change
                    }
                });

        System.out.println("Division result: " + result);
    }
}
