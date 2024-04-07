package jl003_projects;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Person {
    public enum Sex {MALE, FEMALE}

    String name;
    LocalDate birthDate;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthDate, Sex gender, String emailAddress) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static int compareByAge(Person p1, Person p2) {
        return p1.getBirthDate() - p2.getBirthDate();
    }

    public static List<Person> getPersons() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("John", LocalDate.of(1980, 1, 1), Sex.MALE, "example1@example.com"));
        persons.add(new Person("Jane", LocalDate.of(1945, 1, 1), Sex.FEMALE, "example2@example.com"));
        persons.add(new Person("Mary", LocalDate.of(1976, 1, 1), Sex.FEMALE, "example3@example.com"));
        persons.add(new Person("Peter", LocalDate.of(1985, 1, 1), Sex.MALE, "example4@example.com"));
        persons.add(new Person("Lisa", LocalDate.of(1990, 1, 1), Sex.FEMALE, "example5@example.com"));
        persons.add(new Person("Sarah", LocalDate.of(1995, 1, 1), Sex.FEMALE, "example6@example.com"));
        persons.add(new Person("John", LocalDate.of(1968, 1, 1), Sex.MALE, "example7@example.com"));
        return persons;
    }

}
