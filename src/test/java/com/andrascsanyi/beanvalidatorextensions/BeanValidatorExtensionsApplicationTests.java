package com.andrascsanyi.beanvalidatorextensions;

import jakarta.validation.Validation;
import jakarta.validation.Validator;

public class BeanValidatorExtensionsApplicationTests {
    protected Validator validator;
    
    public BeanValidatorExtensionsApplicationTests() {
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
