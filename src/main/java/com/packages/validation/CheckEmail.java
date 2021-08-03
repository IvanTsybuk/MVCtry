package com.packages.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {


    public String value() default ".com"; // default значение, по которому будет идти сравнение
    public String message() default "email should ends with .com"; // default сообщение вывода при ошибке

    public Class<?>[] groups() default {};//позволяют разбивать аннотации по группам
    public Class<? extends Payload>[]payload() default {};// payload используется для переноса информации о метаданных клиента
}
