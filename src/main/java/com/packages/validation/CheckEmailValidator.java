package com.packages.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> { // CheckEmail - имя самой аннотации, тип данных, к чему применяется

    private String endOfEmail; // переменная для проверки вводимого значения

    @Override
    public void initialize(CheckEmail checkEmail) { // initialize(CheckEmail constraintAnnotation) - по умолчанию при имплементации
        endOfEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue
            , ConstraintValidatorContext constraintValidatorContext) { // enteredValue - значение, вводимое в форму

        return enteredValue.endsWith(endOfEmail);

    }
}

