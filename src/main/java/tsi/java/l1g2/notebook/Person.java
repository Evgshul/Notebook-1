package tsi.java.l1g2.notebook;

import asg.cliche.Command;
import asg.cliche.Param;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person extends Note {
    private String firstName;
    private String lastName;
    private String email;
    private List<String> phones = new ArrayList<>();

    @Command
    public String getFirstName() {
        return firstName;
    }

    @Command
    public void setFirstName(@Param(name = "first name") String firstName) {
        this.firstName = firstName;
    }

    @Command
    public String getLastName() {
        return lastName;
    }

    @Command
    public void setLastName(@Param(name = "last name") String lastName) {
        this.lastName = lastName;
    }

    @Command
    public List<String> getPhones() {
        return phones;
    }

    @Command
    public void addPhones(@Param(name = "phones") String... phones) {
        Collections.addAll(this.phones, phones);
    }

    @Command
    public String getEmail() {
        return email;
    }

    @Command
    public void setEmail(@Param(name = "email") String email) {
        this.email = email;
    }


    @Override
    public boolean contains(String str) {
        String strLow = str.toLowerCase();
        return super.contains(strLow)
                || firstName.toLowerCase().contains(strLow)
                || lastName.toLowerCase().contains(strLow)
                || email.toLowerCase().contains(strLow)
                || phones.stream().anyMatch(p -> p.toLowerCase().contains(strLow));
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", note='" + getText() + '\'' +
                ", email='" + email + '\'' +
                ", phones=" + phones +
                '}';
    }
}
