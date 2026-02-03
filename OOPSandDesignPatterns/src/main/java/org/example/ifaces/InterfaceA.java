package org.example.ifaces;

import java.util.Comparator;

public interface InterfaceA /*extends Comparator<Object>*/ {

    int a = 20;
    void method1();
    default void methodA(){
        System.out.print("a");
    }

    static void staticA(){

    }

}
