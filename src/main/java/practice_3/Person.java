package main.java.practice_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    String getFirstName() {
        return this.firstName;
    }

    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    String getLastName() {
        return this.lastName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void printPersonInfo() {
        System.out.println("Firstname: " + this.firstName + ", Lastname: " + this.lastName + ", SSN: " + this.ssn);
    }
}
