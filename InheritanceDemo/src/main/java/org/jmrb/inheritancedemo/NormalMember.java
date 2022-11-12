package org.jmrb.inheritancedemo;

/*
To declare a child (or derived) class, we have to use the extends Java keyword.
This way, NormalMember here will inherit all public, and protected fields and
methods from Member class.
*/
public class NormalMember extends Member {
    /*
    This class already has the fields:
      - welcome and
      - annual Fee,
    and the methods:
      - getDiscount,
      - setDiscount,
      - displayMemInfo and
      - calculateAnnualFee
     */

    /*
    Child constructor, not calling a parent class constructor, will look for a
    constructor with same number of arguments in the parent class, call it, and
    then run the child constructor.
     */
    public NormalMember() {
        System.out.println("Child constructor with no parameter");
    }

    /*
    Child constructor with parameters must use the super Java keyword. This will
    call the parent class constructor with the same number of parameters, and
    then run the child constructor.

    NOTE: super must be the first statement in the child constructor.
     */
    public NormalMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }

    /*
    Annotations: metadata that provides extra info to the compiler

    @Override informs the compiler that this method is going to override the
    method, with the same name, of parent class.
     */
    @Override
    public void calculateAnnualFee() {
        annualFee = (1 - 0.01 * getDiscount()) * (100 + 12 * 30);
    }

}
