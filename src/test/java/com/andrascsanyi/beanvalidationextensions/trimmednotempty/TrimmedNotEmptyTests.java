package com.andrascsanyi.beanvalidationextensions.trimmednotempty;

import com.andrascsanyi.beanvalidationextensions.BeanValidationExtensionsApplicationTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TrimmedNotEmptyTests extends BeanValidationExtensionsApplicationTests {
    
    public static Stream<Arguments> testDefaultGroupData() {
        return Stream.of(
            Arguments.of(DefaultGroupEntity.builder().id("").build(), 1),
            Arguments.of(DefaultGroupEntity.builder().id(" ").build(), 1),
            Arguments.of(DefaultGroupEntity.builder().id("  ").build(), 1),
            Arguments.of(DefaultGroupEntity.builder().id("   ").build(), 1),
            Arguments.of(DefaultGroupEntity.builder().id("a").build(), 0),
            Arguments.of(DefaultGroupEntity.builder().id("a ").build(), 0),
            Arguments.of(DefaultGroupEntity.builder().id("a  ").build(), 0),
            Arguments.of(DefaultGroupEntity.builder().id(" a  ").build(), 0),
            Arguments.of(DefaultGroupEntity.builder().id("  a  ").build(), 0)
        );
    }
    
    public static Stream<Arguments> testCustomGroupData() {
        return Stream.of(
            Arguments.of(CustomGroupEntity.builder().id("").build(), 1),
            Arguments.of(CustomGroupEntity.builder().id(" ").build(), 1),
            Arguments.of(CustomGroupEntity.builder().id("  ").build(), 1),
            Arguments.of(CustomGroupEntity.builder().id("   ").build(), 1),
            Arguments.of(CustomGroupEntity.builder().id("a").build(), 0),
            Arguments.of(CustomGroupEntity.builder().id("a ").build(), 0),
            Arguments.of(CustomGroupEntity.builder().id("a  ").build(), 0),
            Arguments.of(CustomGroupEntity.builder().id(" a  ").build(), 0),
            Arguments.of(CustomGroupEntity.builder().id("  a  ").build(), 0)
        );
    }
    
    @ParameterizedTest
    @MethodSource("testDefaultGroupData")
    public void testDefaultGroup(DefaultGroupEntity input, int expected) {
        
        assertThat(validator.validate(input).size())
            .withFailMessage("string value: -" + input.getId() + "-")
            .isGreaterThanOrEqualTo(expected);
    }
    
    @ParameterizedTest
    @MethodSource("testCustomGroupData")
    public void testCustomGroup(CustomGroupEntity input, int expected) {
        
        assertThat(validator.validate(input, CustomGroup.class).size())
            .withFailMessage("string value: -" + input.getId() + "-")
            .isGreaterThanOrEqualTo(expected);
    }
}
