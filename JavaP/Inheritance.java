package javaCC.JavaP;
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Speed", 3, "Labrador");
        myDog.eat(); 
        myDog.bark(); 
    }
}
