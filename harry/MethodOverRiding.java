package javaCC.harry;

public class MethodOverRiding { // main class
    public static void main(String[] args) {
        var mypc = new Dell("Dell Inspiron 14 2", "AMD Ryzen 5 7530U", "AMD Radeon Graphics", "8GB 4266MHz",
                    "512GB M.2", "4 Cell, 54 Wh, integrated"); // constructor for Dell
        
        mypc.intro();
        mypc.specification();
        
    }
}

class Computer { // class
    public String model;
    public String cpu;
    public String ram;
    public String gpu;
    public String storage;

    public Computer(String model, String cpu, String gpu, String ram, String storage) { // constructor
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.storage = storage;
    } // constructor ends

    public void intro() {
        System.out.println("Your computer has the following specification : ");
    }
} // class ends

class Dell extends Computer { // class starts
    String battery;

    public Dell(String model, String cpu, String gpu, String ram, String storage, String battery) { // constructor
        super(model, cpu, gpu, ram, storage);
        this.battery = battery;
    } // constructor ends

    @Override   //! notation to indicate Method overriding
    public void intro() { // method
        System.out.println("Your Dell Laptop has the following specification : ");    
    }

    public void specification() { // method
        System.out.println("Model: " + model + '\n' + "Processor: " + cpu + '\n' + "Ram: " + ram + '\n'
        + "Graphics: " + gpu + '\n' + "Storage: " + storage + '\n');
    }
}
    
