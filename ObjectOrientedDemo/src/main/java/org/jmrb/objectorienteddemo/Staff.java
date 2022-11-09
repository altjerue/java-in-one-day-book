package org.jmrb.objectorienteddemo;

public class Staff {
    /*
    Fields of our class

    General note: fields and variable are declared in a similar manner. Fields
    are declared for a class while variables are declared in a method.
     */
    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;

    /*
    Constructor with one parameter
     */
    public Staff(String name) {
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------");
    }

    /*
    Constructor with two parameters
     */
    public Staff(String firstName, String lastName) {
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------");
    }

    /*
    Methods of our class
     */
    public void printMessage() {
        System.out.println("Calculating Pay...");
    }

    /*
    Method without parameters
     */
    public int calculatePay() {
        printMessage();

        int staffPay;
        staffPay = hoursWorked * hourlyRate;

        if (hoursWorked > 0) {
            return staffPay;
        } else {
            return -1;
        }
    }

    /*
    Method with the same name as above, but with two parameters
     */
    public int calculatePay(int bonus, int allowance) {
        printMessage();

        if (hoursWorked > 0) {
            return hoursWorked * hourlyRate + bonus + allowance;
        } else {
            return 0;
        }

    }

    /*
    Setter
     */
    public void setHoursWorked(int hours) {
        if (hours > 0) {
            hoursWorked = hours;
        } else {
            System.out.println("Error: HoursWorked Cannot be smaller than zero");
            System.out.println("Error: HoursWorked is not updated");
        }
    }

    /*
    Getter
     */
    public int getHoursWorked() {
        return hoursWorked;
    }
}
