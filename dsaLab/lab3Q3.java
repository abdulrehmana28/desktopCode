package javaCC.dsaLab;

import java.util.Scanner;

public class lab3Q3 {
    public static void main(String[] args) {
        PalindromeClass obj = new PalindromeClass();
        String input = obj.inputFun();
        String reInput = obj.reverseString(input);
        obj.isPalindrome(input, reInput);
    }
    
}

class PalindromeClass {
    public String inputFun(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();
        return str;  
    }

    public String reverseString(String str) {
        StringBuilder revString = new StringBuilder(str).reverse();
        return revString.toString();
    }

    public void isPalindrome(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
