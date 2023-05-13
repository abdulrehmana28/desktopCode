package javaCC.HomeWork;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

 class MainPerson { 
    public static void main(String[] args) {
        var person_1 = new Person("Pahaar Khan", 22);
        var person_2 = new Person("Samandar Khan", 25);

        System.out.println("The name of Person one is: " + person_1.name + " & his age is" + person_1.age);
        System.out.println("The name of Person two is: " + person_2.name + " & his age is" + person_2.age);
    }

}
