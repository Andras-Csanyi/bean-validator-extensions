package com.andrascsanyi.beanvalidationextensions;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This constraint describes that the provided {@link String} length must be between the provided minimum (inclusive) and maximum (exclusive)
 * length after it is trimmed.
 *
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TrimmedSizeValidator.class)
@Documented
public @interface TrimmedSize {
    String message() default "{com.andrascsanyi.encyclopediagalactica.common.validation.TrimmedSize}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int min() default 0;

    int max() default Integer.MAX_VALUE;
}
