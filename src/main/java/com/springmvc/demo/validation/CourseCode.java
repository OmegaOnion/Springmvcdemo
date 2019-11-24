package com.springmvc.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default code
    String value() default "ABC";
    // define default error message
    String message() default "must start with ABC";
    // define default groups
    Class<?>[] groups() default{};
    // define default payload
    Class<? extends Payload>[] payload() default {};
}
