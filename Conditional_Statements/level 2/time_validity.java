import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    if(a>12 || b>=60 || c>=60){
      System.out.println("Not Valid");
    }
    else{
      System.out.println("Valid");
    }
  }
}
