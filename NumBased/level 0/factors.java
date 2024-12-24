import java.util.Scanner;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        for (long factor = 1; factor <= num / 2; factor++) {
            if (num % factor == 0)
                System.out.print(factor + ",");
        }
        System.out.print(num);
    }
}
