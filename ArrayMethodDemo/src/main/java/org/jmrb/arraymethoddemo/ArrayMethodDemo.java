package org.jmrb.arraymethoddemo;

import java.util.Arrays;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        MyClass amd = new MyClass();

        int[] myArray = {1, 2, 3, 4, 5};
        amd.printFirstElement(myArray);

        int[] myArray2 = amd.returnArray();
        System.out.println(Arrays.toString(myArray2));

    }
}
