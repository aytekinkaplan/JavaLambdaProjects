package jl001_simpleprojects;

import java.util.stream.IntStream;

public class JL011_MathFunctions {
    // Define the factorialStream method outside the main method
    public static int factorialStream(int n) {
        // Calculate factorial using Java Stream API
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        // Call the factorialStream method inside the main method
        int n = 6; // Let's calculate factorial for example 5
        int result = factorialStream(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
