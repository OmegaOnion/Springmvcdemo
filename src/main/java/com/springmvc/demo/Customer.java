package com.springmvc.demo;


import com.springmvc.demo.validation.CourseCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

    private String firstName;

    @NotNull(message="required field")
    @Size(min=1,message = "at least 1 character")
    private String lastName;

    @Min(value = 0, message = "Minimum 0 passes")
    @Max(value = 10, message = "Maximum of 10 passes")
    @NotNull(message = "required field")
    private Integer freePasses;

    @Pattern(regexp="[a-zA-Z]{2}[0-9a-zA-Z]{1,2}?\\s?[0-9][a-zA-Z]{2}", message = "Please enter a valid UK postcode")
    private String postcode;

    @CourseCode(value = "ABC", message = "Course code must start with 'ABC' ")
    private String courseCode;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
