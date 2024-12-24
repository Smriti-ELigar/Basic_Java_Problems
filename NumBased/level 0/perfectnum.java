import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long sum = 0;
        for (long checkFactor = 1; checkFactor < num; checkFactor++) {
            if (num % checkFactor == 0) {
                sum += checkFactor;
            }
        }
        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
