package com.example.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstrainValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //We can use array instead.  String[] value() default {"ECTI", "ETC"};
    public String value() default "ECTI";

    public String message() default "ECTI is default";

    public Class<?>[] groups() default{};

    public Class<? extends Payload>[] payload() default {};
}
