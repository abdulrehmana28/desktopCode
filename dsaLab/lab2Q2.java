package javaCC.dsaLab;

import java.util.Scanner;

public class lab2Q2 {

    public static void main(String[] args) {
        PrimeNumber num = new PrimeNumber();
        num.prime(inputFun());

    }

    public static int inputFun() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        return number;
    }
}

class PrimeNumber {
    public void prime(int number) {
        System.out.print("Prime numbers are 2 3");
        int m, k;

        for (m = 3; m <= number; m = m + 2) {
            boolean isPrime = false;
            for (k = 2; k <= Math.sqrt(m); k++) {
                if (m % k == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                System.out.print(" " + m);
            }
        }
    }
}
