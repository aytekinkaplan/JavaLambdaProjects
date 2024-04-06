package jl001_simpleprojects; // Package declaration

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JL007_MathFunctions { // Class declaration
    public static void main(String[] args) { // Main method declaration
        List<Integer> numbers = new ArrayList<Integer>(); // Create a list to store integers

        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter your " + (i + 1) + "th number: "); // Prompt the user for input
            numbers.add(Integer.parseInt(scanner.nextLine())); // Add the user's input to the list's elements
        }
        numbers.forEach(System.out::println);
        System.out.println("Max number: " + numbers.stream().reduce(0, Integer::max));
    }
}
