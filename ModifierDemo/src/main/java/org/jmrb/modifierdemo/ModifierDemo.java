package org.jmrb.modifierdemo;

public class ModifierDemo {
    public int publicNum = 2;
    protected int protectedNum = 3;
    int packagePrivateNum = 4; // field declared without any access modifier is package-private
    private int privateNum = 1;
}

/*
public:
  - can be accessed from anywhere, no restrictions

protected:
  - can be accessed from within the class where is declared
  - can be accessed by any class in the same package
  - can be accessed by any child class (subclass)

no access modifier (= package-private):
  - by default is package-private
  - can be accessed from anywhere within the package where is declared

private:
  - only accessible within the class where is declared

 */
