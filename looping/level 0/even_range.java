// Find the sum of even numbers in the given range.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long sum = 0;
        long st = scanner.nextLong();
        long end = scanner.nextLong();

        for (long i = st; i <= end; i += 1) {
            if (value % 2 == 0) {
                sum = i + sum;
            }
        }

        System.out.print(sum);

        
        scanner.close();
    }
}
