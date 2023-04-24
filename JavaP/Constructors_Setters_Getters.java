package javaCC.JavaP;
//import java.util.*;

public class Constructors_Setters_Getters {

    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        var ali = new StudentMarks(80); // object with modified initial value 

        int alimarks = ali.getMarks(); // storing getter value 
        System.out.println(alimarks);  // printing
    }
}

class StudentMarks {  // second class
    private int marks;  // private data field
    
    public StudentMarks(int marks){  // modified constructor with arguments
        setMarks(marks);             // for changing initial value setter methods is used
    }

    public void setMarks(int marks){ // Setter method
        if (marks <= 0)              // for input value 
            throw new IllegalArgumentException("Marks must be greater than 0"); // print error message
        this.marks = marks;  // parameter = 
    }

    public int getMarks(){  // getter method
        return marks;       // for output value
    }
}

