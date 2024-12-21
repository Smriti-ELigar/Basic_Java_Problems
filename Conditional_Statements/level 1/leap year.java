import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long year = scanner.nextLong();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap year");
        }
    }
}

// if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) explain why those conditions taken
// Certainly! Let's break down the conditions:

// Condition 1: (year % 4 == 0)
// Why this?: A year is considered for being a leap year if it is divisible by 4. This is because the Earth takes about 365.25 days to orbit the Sun. So, every 4 years, we accumulate an extra day (0.25 * 4 = 1).

// Example: 2024 is divisible by 4 (2024 ÷ 4 = 506), so it might be a leap year.

// Condition 2: (year % 100 != 0)
// Why this?: However, not all years divisible by 4 are leap years. If the year is a century year (like 1700, 1800, 1900), it should not be a leap year. This is to correct for the fact that our calendar would otherwise gain too many extra days over long periods.

// Example: 1900 is divisible by 4, but also by 100. Thus, it's not a leap year (no extra day in February).

// Condition 3: (year % 400 == 0)
// Why this?: To account for slight inaccuracies in the first two conditions, century years that are divisible by 400 are leap years. This ensures the calendar stays in sync with the Earth's orbit.

// Example: 2000 is divisible by both 100 and 400. Therefore, it is a leap year.
