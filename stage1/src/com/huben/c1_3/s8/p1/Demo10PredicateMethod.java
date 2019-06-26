package com.huben.c1_3.s8.p1;

import java.util.function.Predicate;

public class Demo10PredicateMethod {
    public static void main(String[] args) {
        System.out.println(andPredicate("Hello World", (str) -> str.length() > 10, (str) -> str.length() < 15));
        System.out.println(andPredicate("Hello World Hello", (str) -> str.length() > 10, (str) -> str.length() < 15));

        System.out.println(orPredicate("Hello", (str) -> str.length() < 10, (str) -> str.length() > 15));
        System.out.println(orPredicate("Hello World", (str) -> str.length() < 10, (str) -> str.length() > 15));
        System.out.println(orPredicate("Hello World Hello", (str) -> str.length() < 10, (str) -> str.length() > 15));

        System.out.println(notPredicate("Hello", (str) -> str.length() < 10));

    }

    private static boolean andPredicate(String str, Predicate<String> predicate1, Predicate<String> predicate2) {
        return predicate1.and(predicate2).test(str);
    }

    private static boolean orPredicate(String str, Predicate<String> predicate1, Predicate<String> predicate2) {
        return predicate1.or(predicate2).test(str);
    }

    private static boolean notPredicate(String str, Predicate<String> predicate) {
        return predicate.negate().test(str);
    }


}
