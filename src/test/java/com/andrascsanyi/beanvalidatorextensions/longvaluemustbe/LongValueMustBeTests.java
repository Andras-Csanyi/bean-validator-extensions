package com.andrascsanyi.beanvalidatorextensions.longvaluemustbe;

import com.andrascsanyi.beanvalidatorextensions.BeanValidatorExtensionsApplicationTests;
import jakarta.validation.ConstraintViolation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class LongValueMustBeTests extends BeanValidatorExtensionsApplicationTests {
    
    public static Stream<Arguments> dataDefaultGroup() {
        return Stream.of(
            Arguments.of(DefaultGroupEntity.builder().value(0L).build(), 0),
            Arguments.of(DefaultGroupEntity.builder().value(1L).build(), 1),
            Arguments.of(DefaultGroupEntity.builder().value(-1L).build(), 1)
        );
    }
    
    public static Stream<Arguments> dataCustomGroup() {
        return Stream.of(
            Arguments.of(CustomGroupEntity.builder().value(0L).build(), 0),
            Arguments.of(CustomGroupEntity.builder().value(1L).build(), 1),
            Arguments.of(CustomGroupEntity.builder().value(-1L).build(), 1)
        );
    }
    
    
    @ParameterizedTest
    @MethodSource("dataDefaultGroup")
    public void testDefaultGroup(DefaultGroupEntity entity, Integer expectedErrors) {
        Set<ConstraintViolation<DefaultGroupEntity>> constraintViolation = validator.validate(entity);
        
        assertThat(constraintViolation.size())
            .withFailMessage("The provided value is: " + entity.getValue())
            .isEqualTo(expectedErrors);
    }
    
    @ParameterizedTest
    @MethodSource("dataCustomGroup")
    public void testCustomGroup(CustomGroupEntity entity, Integer expectedErrors) {
        Set<ConstraintViolation<CustomGroupEntity>> constraintViolation = validator.validate(
            entity,
            CustomGroup.class);
        
        assertThat(constraintViolation.size())
            .withFailMessage("The provided value is: " + entity.getValue())
            .isEqualTo(expectedErrors);
    }
}
