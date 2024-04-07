package jl003_projects;

import java.time.LocalDate;
import java.util.List;

public class PersonRunner4 {

    public static void main(String[] args) {
        // Get a list of persons
        List<Person> persons = Person.getPersons();

        // Loop through each person and print details
        persons.forEach(person -> System.out.println(
                "Person's name: " + person.getName() +
                        ", Birthdate: " + person.getBirthDate() +
                        ", Gender: " + person.getGender() +
                        ", Email Address: " + person.getEmailAddress()));

        // Print a message for people aged out of 55
        System.out.println("\nPeople aged out of 55: ");

        // Filter and print people by age
        persons.stream()
                .filter(person -> person.getBirthDate() >= 55)  // Filter by age
                .forEach(person -> System.out.println(
                        "Person's name: " + person.getName() +
                                ", Birthdate: " + person.getBirthDate() +
                                ", Gender: " + person.getGender() +
                                ", Email Address: " + person.getEmailAddress()));
    }
}
