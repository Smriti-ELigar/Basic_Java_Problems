import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long min = Math.min(a,b);
    if(c<min){
      min = c;
    }
    System.out.println("Minimum is "+ min);
    
  }
}
