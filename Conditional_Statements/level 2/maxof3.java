import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    
    long max = Math.max(a,Math.max(b,c));
    System.out.println("Maximum is "+ max );
  }
}
