package com.andrascsanyi.beanvalidationextensions;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This constraint describes the case that the provided {@link String} value cannot be empty after it is trimmed.
 * <p>
 * The validator judges null to be invalid value.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TrimmedNotBlankValidator.class)
@Documented
public @interface TrimmedNotBlank {

    String message() default "{com.andrascsanyi.encyclopediagalactica.common.validation.TrimmedNotBlank}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
