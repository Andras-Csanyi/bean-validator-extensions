package com.andrascsanyi.beanvalidationextensions;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This constraint describes the case when the provided {@link Long} value must be greater or equal to the provided
 * parameters.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LongValueMustBeGreaterOrEqualToValidator.class)
@Documented
public @interface LongValueMustBeGreaterOrEqualTo {
    long mustBeGreaterOrEqualTo() default Long.MIN_VALUE;

    String message() default "{com.andrascsanyi.encyclopediagalactica.common.validation.LongValueMustBeGreaterOrEqualT}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
