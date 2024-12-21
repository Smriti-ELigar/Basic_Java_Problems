// Given 2 numbers, find the minimum of these 2 numbers

import java.util.*;
import java.math.*;
class Solu{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long min = Math.min(a,b);
    System.out.printf("Minimum of %d and %d is %d%n",a,b,min);
  }
}

//or

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        if (num1 < num2) {
            System.out.printf("Minimum of %d and %d is %d", num1, num2, num1);
        } else {
            System.out.printf("Minimum of %d and %d is %d", num1, num2, num2);
        }
    }
}
