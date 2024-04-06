package jl001_simpleprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JL004_MathFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        // Prompt user to enter 6 numbers and add them to the list
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter your " + (i + 1) + "th number: ");
            numbers.add(scanner.nextInt());
        }

        // Print out the entered numbers
        numbers.forEach(System.out::println);

        // Calculate and print the sum of all the entered numbers
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // Calculate and print the difference between all the entered numbers
        int difference = numbers.stream().reduce((x, y) -> x - y).orElse(0);
        System.out.println("Subtraction: " + difference);
    }
}
