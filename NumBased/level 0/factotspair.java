// Given an input, print the factors of the number in pairs such that the
// product of the pair gives the input.

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    // List<String> pairs = new Arraylist<>();
    for(long i = 1; i*i<=n;i++){
      if(n%i == 0){
        long pair = n/i;
        System.out.println(i+" * "+pair);
      }
    }
  }
}
