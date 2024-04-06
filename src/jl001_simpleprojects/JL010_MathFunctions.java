package jl001_simpleprojects; // Package declaration

import java.util.Random;
import java.util.function.IntUnaryOperator;

public class JL010_MathFunctions {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1; // Select a random number between 1 and 10
        System.out.println("Number: " + number);

        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Method to calculate factorial
    public static int calculateFactorial(int n) {
        IntUnaryOperator factorialFunction = x -> x == 0 ? 1 : x * calculateFactorial(x - 1);
        return factorialFunction.applyAsInt(n);
    }
}
