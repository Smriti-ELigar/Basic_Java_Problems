import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    
    long max1 = Math.max(a, Math.max(b,c));
    long max2 = Math.max(max1,d);
    long largest = Math.max(max1,max2);
    System.out.println("Largest is "+ largest);
  }
}

// or

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n1 = scanner.nextLong();
        long n2 = scanner.nextLong();
        long n3 = scanner.nextLong();
        long n4 = scanner.nextLong();
        long max = (n1 > n2 ? n1 : n2) > (n3 > n4 ? n3 : n4) ? (n1 > n2 ? n1 : n2) : (n3 > n4 ? n3 : n4);

        System.out.printf("Largest is %d", max);
    }
}
