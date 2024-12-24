import java.util.Scanner;
public class FactorCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long count = 0;
        for (long i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        System.out.println(count);
    }
}
