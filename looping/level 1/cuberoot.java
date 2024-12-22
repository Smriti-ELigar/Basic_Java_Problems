import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long cubroot = (int) Math.cbrt(a);
    
    if(cubroot*cubroot*cubroot == a){
      System.out.println("Perfect Cube");
    }
    else{
      System.out.println("Not a Perfect Cube");
    }
  }
}

// or

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int three = 3;
         while (num % three == 0) {
                num = num / three;
                
            }
            
        if (num == 1 )
            System.out.println("Perfect Cube");
        else
            System.out.println("Not a Perfect Cube");
    }
}
