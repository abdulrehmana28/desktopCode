package javaCC.apnaC;

public class StringBuilders {
    public static void main(String[] args) {

        String name = "Ali";
        System.out.println(name);

        //! String Builder
        // In Java, a StringBuilder is a class that allows you to create and manipulate strings in a more efficient way than using the String class directly.
        // StringBuilder modifies the existing string without having to create a new object each time.
        
        StringBuilder varBuilder = new StringBuilder("Tony");
        System.out.println(varBuilder);

        // set char at index
        varBuilder.setCharAt(0, 'P');  // used to set char at index
        System.out.println(varBuilder);

        // insert function
        varBuilder.insert(0, 'S'); // used to insert char & other shift other indexes
        System.out.println(varBuilder);

        // delete function
        varBuilder.delete(0, 1); // used to delete char
        System.out.println(varBuilder);

        // append function
        varBuilder.append(" Pontiex"); // used to add string at the end
        System.out.println(varBuilder);
    }
}
