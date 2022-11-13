package org.jmrb.interfacedemo;

public interface MyInterface {
    int myInt = 5;

    void someMethod();

    public static void someStaticMethod() {
        System.out.println("This is a static method in an interface");
    }

    public default void someDefaultMethod() {
        System.out.println("This is a default method in an interface");
    }
}

/*
Remember:
  - Abstract methods do not have a body, and MUST be instantiated in
  the derived lass.
  - Fields declared in an interface are implicitly public, static and final.
  - Static fields, and methods CAN be accessed using the name of the interface.
  - Default methods = non-static method.
 */
