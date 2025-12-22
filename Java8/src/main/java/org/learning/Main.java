package org.learning;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Predicate
        Predicate<Integer> p1 = n -> n > 10;
        Predicate<Integer> p2 = n -> n % 2 == 0;
        System.out.println(p1.test(12));  //true
        System.out.println(p1.test(9));   //false

        //and
        Predicate<Integer> combined = p1.and(p2);
        System.out.println(combined.test(12)); // true
        System.out.println(combined.test(15)); //false
        //or
        //negate
        //isEqual
        //not


        Function<String, Integer> f = s -> s.length();  //(String::length , we can use method reference also)
        int i = f.apply("Java");
        System.out.println(i);
        //andThen()
        //compose()
        //identity()

        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello");
        //andThen();

        Supplier<Integer> s = () -> new Random().nextInt(100);
        System.out.println(s.get());

    }
}