// Given a number and a raise value, do raise the value of the given number to taise value times. i.e., Implement the power function without using the inbuilt pow() function.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long basenum = scanner.nextLong();
        long pow = scanner.nextLong();
        long ans = 1;

        for (int i = 1; i <= pow; i++) {
            ans *= basenum;
        }

        System.out.println(ans);
    }
}

// Input
// The program starts by taking two inputs:
// num: The base number.
// pow: The exponent or power.
// Initialize the Answer
// A variable ans is initialized to 1. This will hold the result as we calculate the power.
