// Write a C program to input electricity unit charge and calculate the total electricity bill according to the given condition:

// For First 50 Units Rs.0.50/unit
// For next 100 Units Rs.0.75/unit
// For next 100 Units Rs.1.20/unit
// For unit above 250 Rs.1.50/unit
// An additional surcharge of 20% is added to the bill

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double ans;
        if (number > 250) {
            ans = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (number - 250) * 1.50;
        } else if (number > 150) {
            ans = (50 * 0.50) + (100 * 0.75) + (number - 150) * 1.20;
        } else if (number > 50) {
            ans = (50 * 0.50) + (number - 50) * 0.75;
        } else {
            ans = number * 0.5;
        }
        ans = ans + (ans * 0.2);
        System.out.printf("%.2f", ans);
    }
}
