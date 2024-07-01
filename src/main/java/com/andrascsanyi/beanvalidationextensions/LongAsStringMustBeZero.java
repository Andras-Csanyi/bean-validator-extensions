package com.andrascsanyi.beanvalidationextensions;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This constraint describes the case when the provided input {@link String} must be equal to 0 when it is parsed as
 * {@link Long}.
 *
 * <p>
 * The validation judges the negative value, the null, empty or blank string values to be valid.
 *
 * <p>
 * <b>Use case:</b> This validation annotation is used to check values coming via GraphQL where the ID is
 * {@link String}.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LongAsStringMustBeZeroValidator.class)
@Documented
public @interface LongAsStringMustBeZero {
    String message() default "{com.andrascsanyi.encyclopediagalactica.common.validation.LongAsStringMustBeZero}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
