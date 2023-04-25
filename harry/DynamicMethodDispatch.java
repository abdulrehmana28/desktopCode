package javaCC.harry;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        Phone referenceVariable = new SmartPhone(); //!  reference variable of superclass & object of subclass 

        referenceVariable.showTime(); 
        referenceVariable.turningON(); // kis class ka object ha us ka method run ho ga 
        //referenceVariable.music();  //! only superclass methods are accessible from this reference
    }   
}

class Phone {

    public void turningON(){
        System.out.println("Turning on BarPhone");
    }

    public void showTime() {
        System.out.println("Barphone can show time");
    }
}

class SmartPhone extends Phone {

    @Override                   //! override notation
    public void turningON(){
        System.out.println("Turning on SmartPhone");
    }

    public void music() {
        System.out.println("SmartPhone can play music");
    }
}
