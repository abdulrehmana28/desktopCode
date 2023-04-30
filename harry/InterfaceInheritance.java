package javaCC.harry;

public class InterfaceInheritance {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    } 
}

interface SuperInterface {   // parent interface
    void method1();
    void method2();
}

interface ChildInterface extends SuperInterface { // child interface
    void method3();
    void method4();
}

class SampleClass implements ChildInterface { // class that implements child interface
    public void method1() {
        System.out.println("This is method one");
    }                                                   //! all the methods are available here form super & child interface

    public void method2() {
        System.out.println("This is method two");
    }

    public void method3() {
        System.out.println("This is method three");
    }

    public void method4() {
        System.out.println("This is method four");
    }
}