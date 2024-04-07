package jl003_projects;

import java.util.List;

public class PersonRunner2 {
    public static void main(String[] args) {
        // Get a list of persons
        List<Person> persons = Person.getPersons();

        // Loop through each person and print details
        persons.forEach(p -> System.out.println(
                "Person's name is " + p.getName() +
                        ", Birthdate is " + p.getBirthDate() +
                        ", Gender is " + p.getGender() +
                        ", Email is " + p.getEmailAddress())
        );
    }
}
