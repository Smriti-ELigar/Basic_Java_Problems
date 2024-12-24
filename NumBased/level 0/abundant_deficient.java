import java.util.Scanner;
public class NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long sum = 0;
        for (long checkFactor = 1; checkFactor <= num / 2; checkFactor++) {
            if (num % checkFactor == 0) {
                sum += checkFactor;
            }
        }
        if (sum == num) {
            System.out.println("Perfect Number");
        } else if (sum > num) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Deficient Number");
        }
    }
}
