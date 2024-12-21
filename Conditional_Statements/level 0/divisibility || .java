// Given an integer value, if it is divisible by 3 print “HI”, if it is divisible by 5 print “HELLO”. If it is divisible by both print “HIHELLO”, else  print "NONE"

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("HIHELLO");
        } else if (num % 3 == 0) {
            System.out.println("HI");
        } else if (num % 5 == 0) {
            System.out.println("HELLO");
        } else {
            System.out.println("NONE");
        }
    }
}
