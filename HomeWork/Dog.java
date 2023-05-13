package javaCC.HomeWork;

 class Dog {
    String dogName;
    String dogBreed;

    Dog(String dogName, String dogBreed) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }
}

class MainDogClass {
    public static void main(String[] args) {
        var dog1 = new Dog("Speed", "German Shepherd");
        var dog2 = new Dog("Bullet", "Labrador");
        
        System.out.println("Dog one name " +dog1.dogName + " & Breed " + dog1.dogBreed);
        System.out.println("Dog one name " +dog2.dogName + " & Breed " + dog2.dogBreed);

        System.out.println("Changing dog names");
        
        //! changing dog one with setter method
        dog1.setDogName("Bingo");
        dog1.setDogBreed("Maltipoo");

        //!changing dog two
        dog1.setDogName("Arctic");
        dog1.setDogBreed("Malamute");

        //! after changes
        System.out.println("Dog one name " +dog1.dogName + " & Breed " + dog1.dogBreed);
        System.out.println("Dog one name " +dog2.dogName + " & Breed " + dog2.dogBreed);
    }
}
