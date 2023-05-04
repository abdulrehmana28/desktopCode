package javaCC.harry;

public class Threading2 { //? creating thread using Runnable interface
    public static void main(String[] args) {
        
        ThreadClass01 bullet01 = new ThreadClass01();   //! use bullet & Gun analogy
        Thread gun01 = new Thread(bullet01); 

        ThreadClass02 bullet02 = new ThreadClass02(); // runable
        Thread gun02 = new Thread(bullet02); // thread

        gun01.start();
        gun02.start();
    }
    
}

class ThreadClass01 implements Runnable { //! Runnable is a interface
    @Override
    public void run() { // This is a interface so we must use run() in class or make it abstract
        while(true) {
            System.out.println("This is thread <one> running ");
        }            
    }

}

class ThreadClass02 implements Runnable {
    @Override
    public void run(){
        while(true) {
            System.out.println("This is thread Two! running ");
        }        
    }
}
