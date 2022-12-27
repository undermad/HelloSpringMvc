package com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstrainValidation implements ConstraintValidator<CourseCode, String> {

    // We can use array instead. private String[] coursePrefixes;
    // CREATE CONTAINER FOR DEFAULT VALUE
    String coursePrefix;
    
    // INITIALIZE DEFAULT VALUE TO CONTAINER
    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    //Check if stringEnteredByUser is same as default value
    //You can easily add your custom code
    @Override
    public boolean isValid(String stringEnteredByUser,
                           ConstraintValidatorContext constraintValidatorContext) {

        if (stringEnteredByUser != null) {
            boolean result = stringEnteredByUser.startsWith(coursePrefix);
            return result;
        } else
            return false;
    }

}
