package jl002_simpleprojects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JL005_Strings {
    public static void main(String[] args) {
        // Creating a list of 10 fruit names
        List<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Pear", "Banana", "Strawberry", "Cherry",
                "Kiwi", "Grape", "Orange", "Pineapple", "Mango"
        ));

        // Printing the content of the list
        fruits.forEach(System.out::println);

        // Printing the length of the list
        System.out.println("Size of the list: " + fruits.size());

        // Printing the first element of the list
        if (!fruits.isEmpty()) {
            System.out.println("First element: " + fruits.getFirst());
        } else {
            System.out.println("The list is empty.");
        }

        // Printing the last element of the list
        if (!fruits.isEmpty()) {
            System.out.println("Last element: " + fruits.getLast());
        } else {
            System.out.println("The list is empty.");
        }

        // Printing the element at index 3 of the list if it exists
        if (fruits.size() > 3) {
            System.out.println("Element at index 3: " + fruits.get(3));
        } else {
            System.out.println("The list does not have an element at index 3.");
        }

        // Printing the element at index -1 of the list if it exists
        if (!fruits.isEmpty()) {
            System.out.println("Element at index -1: " + fruits.getLast());
        } else {
            System.out.println("The list is empty.");
        }

        // Printing the element at index 100 of the list if it exists
        if (fruits.size() > 100) {
            System.out.println("Element at index 100: " + fruits.get(100));
        } else {
            System.out.println("The list does not have an element at index 100.");
        }

        // Printing the element at index -100 of the list if it exists
        if (!fruits.isEmpty()) {
            System.out.println("Element at index -100: " + fruits.get(fruits.size() + 100));
        } else {
            System.out.println("The list is empty.");
        }
    }
}
