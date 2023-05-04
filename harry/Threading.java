package javaCC.harry;

public class Threading {           //! creating thread by extending thread class
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start(); // start is use to run methods simultaneously & it is in Thread class
        t2.start(); // if we use run() one Thread1 will run 
    }
    
}

class Thread1 extends Thread { // Thread is a class 
    @Override
    public void run() {
        while (true) {
        System.out.println("Thread one is running");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        while (true) {
        System.out.println("Thread two is running");
        }
    }
}
