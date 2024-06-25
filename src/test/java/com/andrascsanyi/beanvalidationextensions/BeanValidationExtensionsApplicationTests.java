package com.andrascsanyi.beanvalidationextensions;

import jakarta.validation.Validation;
import jakarta.validation.Validator;

public class BeanValidationExtensionsApplicationTests {
    protected Validator validator;
    
    public BeanValidationExtensionsApplicationTests() {
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
