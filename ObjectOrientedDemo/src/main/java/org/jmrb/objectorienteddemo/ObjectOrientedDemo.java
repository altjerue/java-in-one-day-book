package org.jmrb.objectorienteddemo;

public class ObjectOrientedDemo {
    public static void main(String[] args) {
        /*
        Instantiating staff1 with one parameter constructor
         */
        Staff staff1 = new Staff("Peter");
        /*
        Using dot operator to access setHoursWorked public setter method
         */
        staff1.setHoursWorked(160);
        /*
        Instantiating pay with two parameter constructor
         */
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);

        // ----- Another example with setters -----
        Staff staff2 = new Staff("Jane", "Lee");
        staff2.setHoursWorked(160);
        pay = staff1.calculatePay();
        System.out.println("Pay = " + pay);

        System.out.println("\n\nUpdating Jane's Hours Worked to -10");
        staff2.setHoursWorked(-10);
        System.out.println("\nHours Worked = " + staff2.getHoursWorked());
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);
    }
}
