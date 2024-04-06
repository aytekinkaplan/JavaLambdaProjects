package JL001_simpleprojects; // Package declaration

import java.util.ArrayList; // Import ArrayList class
import java.util.List; // Import List interface
import java.util.Scanner; // Import Scanner class

public class JL001_MathFunctions { // Class declaration
    public static void main(String[] args) { // Main method declaration
        List<Integer> numbers = new ArrayList<Integer>(); // Create a list to store integers

        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Prompt user to enter the first number
        System.out.println("Please enter your first number: ");
        int number1 = scanner.nextInt(); // Read the first number entered by the user
        numbers.add(number1); // Add the first number to the list

        // Repeat the process for the second through tenth numbers
        System.out.println("Please enter your second number: ");
        int number2 = scanner.nextInt();
        numbers.add(number2);

        // Repeat the process for the third through tenth numbers...
        System.out.println("Please enter your third number: ");
        int number3 = scanner.nextInt();
        numbers.add(number3);

        // Repeat the process for the fourth through tenth numbers...
        System.out.println("Please enter your fourth number: ");
        int number4 = scanner.nextInt();
        numbers.add(number4);

        // Repeat the process for the fifth through tenth numbers...
        System.out.println("Please enter your fifth number: ");
        int number5 = scanner.nextInt();
        numbers.add(number5);

        // Repeat the process for the sixth through tenth numbers...
        System.out.println("Please enter your sixth number: ");
        int number6 = scanner.nextInt();
        numbers.add(number6);

        // Repeat the process for the seventh through tenth numbers...
        System.out.println("Please enter your seventh number: ");
        int number7 = scanner.nextInt();
        numbers.add(number7);

        // Repeat the process for the eighth through tenth numbers...
        System.out.println("Please enter your eighth number: ");
        int number8 = scanner.nextInt();
        numbers.add(number8);

        // Repeat the process for the ninth through tenth numbers...
        System.out.println("Please enter your ninth number: ");
        int number9 = scanner.nextInt();
        numbers.add(number9);

        // Repeat the process for the tenth number...
        System.out.println("Please enter your tenth number: ");
        int number10 = scanner.nextInt();
        numbers.add(number10);

        numbers.forEach(System.out::println); // Print out the entered numbers

        // Calculate and print the sum of all the entered numbers
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }
}
