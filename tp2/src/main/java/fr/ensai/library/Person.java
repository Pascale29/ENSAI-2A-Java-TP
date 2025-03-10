package fr.ensai.library;

import java.util.Objects;

/**
 * Represents a Person.
 */
public class Person {

    // Attributes
    protected String name;
    protected int age;

    /**
     * Constructs a new Person object.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
