package org.learning;

import org.learning.EntityClasses.Students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorsAndComparable {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        List<Students> list = Arrays.asList(new Students(5, "jjjj", 25), new Students(2, "hhhhh", 22), new Students(7, "iii", 27));

//        for(Students student : list){
//            System.out.println(student.toString());
//        }

//        sorted using comparable
//        list.stream().sorted().forEach((s) -> System.out.println(s.toString()));

        /* Comparator */
        System.out.println();
        System.out.println("*****Comparator*****");

        Comparator<Integer> comp = (s1, s2) -> Integer.compare(s1,s2);
        int ss = comp.compare(7,9);
        System.out.println(ss);

        //sorted using Comparator
//        list.stream().sorted((s1,s2) -> s1.getName().compareTo(s2.getName())).forEach((s) -> System.out.println(s.toString()));

        //sort using Comparator's comparing
        list.stream()
                .sorted(Comparator.comparing(s1 -> s1.getName()))                                                           // comparing with Function as a parameter. Takes name (datatype String which implements comparable) and compares
                .sorted(Comparator.comparing((s1) -> s1.getName() , (s1, s2) -> Integer.compare(s1.length(),s2.length())))  // comparing with Function and comparator as a parameters. Takes name and compare that taken name's length as per logic provided by comparator. in that comparator
//                .sorted(Comparator.comparing((s1) -> s1.getName() , Comparator.comparing(s1 -> s1.length())))             // we can also implement that comparator(2nd argument) like this. In this we are using comparing again, and inside that we're  length of the taken names which is int . We can do this because Integer class implements comparable
//                .sorted(Comparator.comparingLong(s1 -> s1.getName().length()))                                               // Same as comparing but particularly used in int cases
                .sorted(Comparator
                                .comparing((Students s) -> s.getName())                                         //If you have thenComparing, always follow a practice of Explicitly saying the type of object passing as the lambda arguments.Because on those scenerios, the compiler loses the context and treats the objects as generic Object types
                                .thenComparing(s1 -> s1.getAge())
//                        .thenComparing(s2 -> s2.getAge(), (s1, s2) -> Integer.compare(s1, s2))
                )
                .sorted(Comparator.naturalOrder())      //uses sorting by comparable . same as sorted.Now here Students class should implements Comparable otherwise this line throws ClassCastException
                .forEach((s) -> System.out.println(s.toString()));


        //reversed examples
        Comparator<Integer> c1 = (i1, i2) -> Integer.compare(i1, i2);
        Comparator<Integer> c21 = Integer::compare;
        Comparator<Integer> c2 = c1.reversed();
        System.out.println(c21.compare(9,7));
        System.out.println(c1.compare(9,7));
        System.out.println(c2.compare(9,7));

        System.out.println("end");
    }

}
