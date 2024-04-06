package jl001_simpleprojects;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JL012_MathFunctions {
    // Define the factorialStream method outside the main method
    public static int factorialStream(int n) {
        // Calculate factorial using Java Stream API
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Read a number from user input
        // Call the factorialStream method to calculate factorial
        int result = factorialStream(n);
        // Print the factorial result
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
