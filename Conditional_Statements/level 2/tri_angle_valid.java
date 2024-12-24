import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long sum = a+b+c;
    if(sum ==180 && a>0 && b>0 && c>0){
      System.out.println("Valid");
    }
    else{
      System.out.println("Not Valid");
    }
    sc.close();
  }
}
