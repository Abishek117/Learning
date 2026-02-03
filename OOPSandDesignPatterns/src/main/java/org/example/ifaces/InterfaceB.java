package org.example.ifaces;

public interface InterfaceB {

    int a2 = 10;
    void method1(int a);
    void method1();

    default void methodA(){
        System.out.print("b");
    }

    static void staticA(){

    }
}
