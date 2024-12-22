// Check whether the given number is a triangular number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int num, flag = 0;

        for (num = 1; num <= (input / 2) + 1; num++) {
            if ((num * (num + 1)) / 2 == input) {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
            System.out.println("Triangular Number");
        else
            System.out.println("Not a Triangular Number");
    }
}
// This formula means the sum of the first  𝑛
//  positive integers gives the 
// n-th triangular number.
