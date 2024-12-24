// Find whether the given two numbers are amicable pair or not.If sum of factors of first number equals to the 2nd number as well as sum of factors of 2nd number equal to first number, its Amicable.
// Note: Dont include the number as factor for finding sum of factors
// i.e., 10 -> 1 + 2 + 5 = 8(sum of factors)
  
import java.util.Scanner;
public class AmicablePair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long s1 = 0;
        long s2 = 0;
        for (long checkFactor = 1; checkFactor <= num1 / 2; checkFactor++) {
            if (num1 % checkFactor == 0) {
                div1 += checkFactor;
            }
        }
        for (long checkFactor = 1; checkFactor <= num2 / 2; checkFactor++) {
            if (num2 % checkFactor == 0) {
                div2 += checkFactor;
            }
        }
        if (num1 == s2 && num2 == s1) {
            System.out.println("Amicable Pair");
        } else {
            System.out.println("Not an Amicable Pair");
        }
    }
}
