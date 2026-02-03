package org.example.classes;

import org.example.abstractClasses.AbstractClassA;
import org.example.ifaces.InterfaceA;
import org.example.ifaces.InterfaceB;

import java.util.LinkedList;

public final class ClassA extends AbstractClassA implements InterfaceA, InterfaceB {

    //    @Override
    public int compare(Object o1, Object o2) {
        InterfaceA.super.methodA();
        return 0;

    }

    int s = super.a;
    public final void mmm(){

    }
    @Override
    public void method1() {

    }

    @Override
    public void methodA() {
        InterfaceA.super.methodA();
    }


    @Override
    public void method1(int a) {

    }

    @Override
    public int abstractMethod1() {
        return 0;
    }

    public ClassA(){
        super(0);
    }


}
