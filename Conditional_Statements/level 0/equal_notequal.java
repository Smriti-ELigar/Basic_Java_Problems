// Given 2 integer input check whether the 2 input are "Equal" or "Not Equal" and print the corresponding message.

import java.util.*;
class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    if(a==b){
      System.out.print("Equal");
    }
    else{
      System.out.print("Not Equal");
    }
  }
}
