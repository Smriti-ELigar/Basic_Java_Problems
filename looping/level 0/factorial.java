// Find the factorial of the given number.

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long mul=1;
    for(int i = 1; i<=a; i++){
      mul *= i;
    }
    System.out.println(mul);
  }
}
