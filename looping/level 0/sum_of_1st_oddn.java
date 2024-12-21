// Write a program to accept an integer N and print the sum of first N odd numbers

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long sum = 0, oddnum = 1; //odd number being added starts with 1
    for(long i = 0; i<a; i++){
      sum = sum + oddnum;
      oddnum = oddnum + 2; //moving pointer
    }
    System.out.println(sum);
  }
}
