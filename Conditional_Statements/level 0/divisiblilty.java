// Given an integer value, check the given input is divisible by 3. If it is divisible print the message "The number is divisible by 3".if it is not divisible print the message "The number is not divisible by 3 and gives a remainder _".

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (num % 3 == 0) {
            System.out.println("The number is divisible by 3");
        } else {
            System.out.printf("The number is not divisible by 3 and gives a remainder %d\n", (num % 3));
        }
    }
}
