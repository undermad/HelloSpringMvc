package com.example.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    @NotNull(message = "Required")
    @Size(min = 1, message = "Required")
    private String firstName;

    private String lastName;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
