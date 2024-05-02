package se.lexicon.model;

import se.lexicon.data.sequencers.PersonIdSequencer;

import java.util.Objects;
import java.util.StringJoiner;

public class Person {

    private int id;
    private String firstName;

    private String lastName;

    private String email;

    private AppUser credentials;


    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setId(id);
    }




    /*
    public String getSummary() {
        return new StringJoiner(", ", Person.class.getSimpleName() + " [", "]")
                .add("id=" + id)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("email='" + email + "'")
                .toString();
    }
    */

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("email='" + email + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //if (firstName.isBlank()) throw new IllegalArgumentException("Enter First Name");
        if (firstName == null) throw new IllegalArgumentException("null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("null");
        //if (lastName.isBlank()) throw new IllegalArgumentException("Enter Last Name");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("null");
        //if (email.isBlank()) throw new IllegalArgumentException("Enter email");
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        //this.id = IdGenerator.generateId();
        this.id = PersonIdSequencer.nextId();
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }
}
