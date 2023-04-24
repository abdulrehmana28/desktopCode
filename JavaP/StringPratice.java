package javaCC.JavaP;


public class StringPratice {
    public static void main(String[] args){

        String myName = "       Abdulrehman Azam      ";

        int stringLength = myName.length();

        String capitalName = myName.toUpperCase();
        String smallName = myName.toLowerCase();

        String cutName = myName.substring(0 , 5);

        char extractCharacter = myName.charAt(12);

        String equalsOrNot = "This is a String";

        boolean testingEquals = equalsOrNot.equals(myName);
        String realName = (myName.trim());

        System.out.println(realName);


        System.out.println("The Length of name is : " + stringLength);

    



       

        
        System.out.println("The Capital name is : " + capitalName);
        System.out.println("The Capital name is : " + smallName);
        System.out.println("The Substring name is : " + cutName);
        System.out.println("The Extrated Charater is : " + extractCharacter);
        System.out.println("The Strings are : " + testingEquals);

        
        
    }
}
