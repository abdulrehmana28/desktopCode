package javaCC.harry;

public class Interfaces { // see the notes for understanding the interface
    public static void main(String[] args) {
        IPhone iphoneX = new IPhone();

        iphoneX.theIphone(); // this method is in Iphone class or subclass
        iphoneX.makeCall(); // this method is in the superclass
        iphoneX.receiveCall();
        iphoneX.jazz();
        iphoneX.connectToInternet(); // this method is in the interface
        iphoneX.takePicture();
        iphoneX.recordVideo();
    }
}

interface Internet {  //! interface is like a class having more features than abstract classes
    void connectToInternet();

    default void jazz(){ // this method is default & implementation here
        jazzIntro();
        System.out.println("Jazz 4G connected");
    }

    private void jazzIntro(){  // this method is for default method functionality
        System.out.println("welcome to Jazz 4G");
    }
}

interface Camera {  //? note here methods are not required to have public keyword as they are public by default
    void takePicture();
    void recordVideo();  // these are like abstract methods
}

class NokiaPhone {   // super class
    void makeCall() {
        System.out.println("It can make calls");
    }

    void receiveCall() {
        System.out.println("It can receive calls");
    }
}

class IPhone extends NokiaPhone implements Camera, Internet{ //! thats how to use multiple inheritance
    void theIphone() {  
        System.out.println("This is the iPhone");  // subclass
    }

    public void connectToInternet(){ //? but here we need to add public keyword to use them 
        System.out.println("You can access to the Internet");
    }

    public void takePicture(){
        System.out.println("Iphone taken picture");
    }

    public void recordVideo(){
        System.out.println("Iphone 4k recorded video");
    }
}


