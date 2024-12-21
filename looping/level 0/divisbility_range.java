// Write a program to accept an integer range and print the sum of number that are divisible by either 3 or 5

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();
    long s =0;
    
    for(long i = 0; i<=n; i++){
      if(i%3 == 0 || i%5==0){
        s += i;
      }
    }
    System.out.println(s);
  }
}
