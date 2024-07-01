package com.andrascsanyi.beanvalidationextensions;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

/**
 * Validates if the provided input {@link String} is equal or greater than 0 when it is parsed as Long.
 *
 * <p>
 * This validation annotation is might be used to check values coming via GraphQL where the ID is {@link String}.
 *
 * <p>
 * The validation judges the null, empty or blank string values to be valid. The validation judges the negative value to
 * be invalid.
 *
 * @author Andras Csanyi
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LongAsStringMustBeGreaterOrEqualToOneValidator.class)
@Documented
public @interface LongAsStringMustBeGreaterOrEqualToOne {

    /**
     * The error message when the constraint is violated.
     */
    String message() default "{com.andrascsanyi.beanvalidationextensions.LongAsStringMustBeGreaterOrEqualToOne}";

    /**
     * The group.
     */
    Class<?>[] groups() default {};

    /**
     * The payload.
     */
    Class<? extends Payload>[] payload() default {};
}
