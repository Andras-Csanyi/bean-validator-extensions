package com.andrascsanyi.beanvalidationextensions;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This constraint describes that the provided {@link String} value cannot be empty after it is trimmed.
 * <p>
 * The validator judges null to be invalid value.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TrimmedNotEmptyValidator.class)
@Documented
public @interface TrimmedNotEmpty {

    String message() default "{com.andrascsanyi.encyclopediagalactica.common.validation.TrimmedNotEmpty}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
