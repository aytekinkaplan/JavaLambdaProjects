package jl003_projects;

import java.time.LocalDate;
import java.util.List;

public class PersonRunner1 {
    public static void main(String[] args) {
        // Create an instance of a person
        Person p = new Person("Joe", LocalDate.of(1980, 1, 1), Person.Sex.MALE, "joe@joe.com");

        // Print the information of the person
        System.out.println("Person's name is " + p.getName() + ", Birthdate is " + p.getBirthDate() +
                ", Gender is " + p.getGender() + ", Email is " + p.getEmailAddress());

        // Get the list of persons
        List<Person> persons = Person.getPersons();

        // Print the information of each person in the list
        for (Person person : persons) {
            System.out.println("Person's name is " + person.getName() + ", Birthdate is " + person.getBirthDate() +
                    ", Gender is " + person.getGender() + ", Email is " + person.getEmailAddress());
        }
    }
}
