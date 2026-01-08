package org.learning;


import org.learning.EntityClasses.Order;
import org.learning.EntityClasses.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob", "CaS","Charlie", "David");

        //example for filter
        System.out.println("**** Example for Filter ****");
        List<String> list1 = names.stream().filter(s -> s.startsWith("C")).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println();


        // example for filter and map combo
        System.out.println("**** Example for Map ****");
        names.stream().map(s -> s.length()).forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println();


        // example for filter and map combo
        System.out.println("**** Example for Filter and Map combo ****");
        List<String> result = names.stream()
                                    .filter(s -> s.startsWith("C"))
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());
        System.out.println(result);
        System.out.println();


        // example for FlatMap
        System.out.println("**** Example for FlatMap ****");
        List<User> userList = Arrays.asList(
                new User(23,"hhhh",Arrays.asList(new Order(103,"Pen", 100),new Order(110,"Bag", 500), new Order(107,"Sharpner", 20))),
                new User(12,"cccc",Arrays.asList(new Order(101,"Erasor", 20), new Order(109,"Ruler", 15))),
                new User(15,"iiii",Arrays.asList(new Order(109,"TextNote", 50))));
        List<Order> orders = userList.stream()
                                     .flatMap(user -> user.getOrders().stream())     //each user has list of orders. flatmap collects all the orders from every list which is inside the user and makes them as a single list (flattening orders). Think like this List<List<Orders>> -> List<Orders>
                                     .collect(Collectors.toList());
        System.out.println(orders);
        System.out.println();

        // example for FlatMap and Map combo
        System.out.println("**** Example for FilterMap and Map combo ****");
        List<String> productNames = userList
                .stream()
                .flatMap(user -> user.getOrders().stream())
                .map(pn -> pn.getProductName())
                .collect(Collectors.toList());
        System.out.println(productNames);
        System.out.println();


        //example for boxed
        System.out.println("**** Example for boxed ****");
        int[] numbers = {1,2,3,4,5};
        List<Integer> resultList = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(resultList);
        System.out.println();


        //example for mapToInt
        System.out.println("**** Example for mapToInt ****");
        List<Order> usersList = Arrays.asList(
                new Order(103,"Pen", 100),
                new Order(107,"Sharpner", 20),
                new Order(110,"Bag", 500)
                );
        int[] userArray = usersList.stream()
                .mapToInt(o -> o.getRate())   //get orders rate from the stream and returns those as a IntStream
                .toArray();                   //convert elements in a IntStream to int[]
        Arrays.stream(userArray).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println();

        // example for FlatMap
        System.out.println("**** Example for flatMapToInt ****");
        List<User> userList1 = Arrays.asList(
                new User(23,"hhhh",Arrays.asList(new Order(103,"Pen", 100),new Order(110,"Bag", 500), new Order(107,"Sharpner", 20))),
                new User(12,"cccc",Arrays.asList(new Order(101,"Erasor", 20), new Order(109,"Ruler", 15))),
                new User(15,"iiii",Arrays.asList(new Order(109,"TextNote", 50))));
        int[] orders1 = userList1.stream()
                .flatMapToInt(user -> user.getOrders().stream().mapToInt(order -> order.getRate()))     //each user has list of orders. flatmap collects all the orders from every list which is inside the user and makes them as a single list (flattening orders). Think like this List<List<Orders>> -> List<Orders>
                .toArray();
        Arrays.stream(orders1).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println();

    }
}
