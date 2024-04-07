package jl003_projects;

import java.time.LocalDate;
import java.util.List;

public class PersonRunner1 {
    public static void main(String[] args) {
        Person p = new Person("Joe", LocalDate.of(1980, 1, 1), Person.Sex.MALE, "joe@joe.com");
        System.out.println("Person`s name is " + p.getName() + " and age is " + p.getBirthDate() + " and gender is " + p.getGender() + " and email is " + p.getEmailAddress());

        List<Person> persons = Person.getPersons();
        for (Person person : persons) {
            System.out.println("Person`s name is " + person.getName() + " and age is " + person.getBirthDate() + " and gender is " + person.getGender() + " and email is " + person.getEmailAddress());
        }
    }
}
