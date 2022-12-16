package com.cydeo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultExceptionMessage {
  String defaultMessage() default "";
  // when an exception occurs during the execution of a method, whatever is in
    // DefaultExceptionDTO is going to be displayed

}
