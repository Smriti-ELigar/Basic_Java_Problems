// Check whether given number is perfect square or not.

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long sqroot = (int)Math.sqrt(a);
    if(sqroot*sqroot == a){
      System.out.println("Perfect Square");
    }
    else{
      System.out.println("Not");
    }
  }
}

// or

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long root;

        for (root = 1; root * root < N; root++) ;

        if (root * root == N)
            System.out.println("Perfect Square");
        else
            System.out.println("Not");
    }
}

