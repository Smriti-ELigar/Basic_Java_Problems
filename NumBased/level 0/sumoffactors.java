import java.util.Scanner;
public class FactorSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long sum = 0;
        for (long checkFactor = 1; checkFactor <= num; checkFactor++) {
            if (num % checkFactor == 0)
                sum += checkFactor;
        }
        System.out.println(sum);
    }
}
