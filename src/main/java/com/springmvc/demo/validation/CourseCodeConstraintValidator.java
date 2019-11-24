package com.springmvc.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode myCourseCode) {
        this.coursePrefix = myCourseCode.value();
    }

    @Override
    public boolean isValid(String courseCode, ConstraintValidatorContext context) {
        return (courseCode == null) || (courseCode.startsWith(coursePrefix));
    }




}
