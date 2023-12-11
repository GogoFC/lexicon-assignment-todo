package se.lexicon;

import java.util.StringJoiner;

public class Person {

    private int id;
    private String firstName;

    private String lastName;

    private String email;

    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setId(id);
    }




    public String getSummary() {
        return new StringJoiner(", ", Person.class.getSimpleName() + " [", "]")
                .add("id=" + id)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("email='" + email + "'")
                .toString();
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
        this.id = IdGenerator.generateId();
    }
}
