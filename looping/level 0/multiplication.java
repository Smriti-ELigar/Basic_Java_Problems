// Print the multiplication table as per the N and multiplicand.

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long mul = sc.nextLong();
    for(long i = 1; i<=n; i++){
      System.out.printf("%d * %d = %d\n", i, mul, (mul*i));
    }
  }
}
