package javaCC.harry;
 class AbstractionTest {
    public static void main(String[] args) {
        AbstractSuperClass obj = new ConcreteSubClass(); // reference of super class & object of subclass (dynamic method dispatch)
        obj.message();
        obj.processor();
        obj.storage();
    }
}

abstract class AbstractSuperClass {   // abstract class may have abstract methods & concrete methods

    abstract public void processor();  // these method is abstract & its implementation
    abstract public void storage();   // is in the subclass & compulsory to use in subclass
    
    public void message() {        // this method is concrete & its implementation is
        System.out.println("This class is abstract");  // here 
    }
}

class ConcreteSubClass extends AbstractSuperClass { // this class is concrete if it extends abstract class then all abstract methods have to be implemented

   
    public void processor() {
        System.out.println("The processor is Intel i5"); // abstract method implementation
    }

    public void storage() {
        System.out.println("The storage is 512 GB");
    }
}