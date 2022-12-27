package com.example.mvc;

import com.example.validation.CourseCode;
import org.springframework.beans.factory.annotation.Required;

import javax.validation.constraints.*;

public class Customer {

    @NotNull(message = "Required")
    @Size(min = 1, message = "Required")
    private String firstName;

    private String lastName;

    @NotNull(message = "Required")
    @Min(value = 12, message = "You need to be at least 12 years old to put an order.")
    @Max(value = 68, message = "You need to be younger than 68 to put an order.")
    private Integer age;

    @Pattern(regexp = "^[a-zA-Z0-9 ]{1,6}$", message = "Accepting only 6 letters/digits.")
    private String postCode;

    @NotNull(message = "Required")
    @CourseCode(value = "ECT", message = "Wrong code.")
    @Pattern(regexp = "^[a-zA-Z0-9 ]{1,4}", message = "Accepting 1-4 letters/digits.")
    private String courseCode;

    public Customer() {
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
