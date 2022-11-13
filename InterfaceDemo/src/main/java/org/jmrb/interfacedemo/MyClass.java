package org.jmrb.interfacedemo;

public class MyClass implements MyInterface { // class that implements MyInterface interface
    @Override // here we're overriding the abstract method someMethod in MyInterface interface
    public void someMethod() {
        System.out.println("This is a method implemented in MyClass");
    }

}
