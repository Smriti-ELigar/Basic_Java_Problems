// Find the minimum number to be divided to make the number as a perfect square

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: The number to process
        int number = scanner.nextInt();
        
        // Variables to track the current factor, its power, and the result
        int currentFactor = 2; 
        int factorPower;
        int resultToDivide = 1;

        // Outer loop: Continue factorization until the number is reduced to 1
        while (number != 1) {
            factorPower = 0; // Reset power count for the current factor
            
            // Inner loop: Count the power of the current factor in the number
            while (number % currentFactor == 0) {
                number = number / currentFactor; // Divide the number by the factor
                factorPower++;
            }

            // Check if the factor has an odd power
            if (factorPower % 2 == 1) {
                resultToDivide *= currentFactor; // Include this factor in the result
            }

            // Move to the next potential factor
            currentFactor++;
        }

        // Output the result: The smallest number to divide to make it a perfect square
        System.out.println(resultToDivide);
    }
}
