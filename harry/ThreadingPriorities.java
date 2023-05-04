package javaCC.harry;

public class ThreadingPriorities {
    public static void main(String[] args) {
        TestThreadClass t1 = new TestThreadClass("Constructor Thread 1");
        TestThreadClass t2 = new TestThreadClass("Constructor Thread 2");
        TestThreadClass t3 = new TestThreadClass("Constructor Thread 3");
        TestThreadClass t4 = new TestThreadClass("Constructor Thread 4");

        t1.setPriority(Thread.MIN_PRIORITY);   //* * There are default / minimum / maximum priority 
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);   //? Thread 2 & 4 will rum more bcz the have Max Priority

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    } 
}

class TestThreadClass extends Thread {
    public TestThreadClass(String name){ //? This is a String constructor in thread class
        super(name);            //* * using super here bcz changing the default constructor
    } 

    public void run(){
        while(true){
            System.out.println("Thread name is " + this.getName()); // get name gives the name of the thread
        }
    }
}
