package com.huben.c1_3.s9.p3;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {

//    int showInt();
//
//    String showString();
//
//    Season showSeason();
//
//    MyAnnotation2 showAnnotation();

    int value();

}
