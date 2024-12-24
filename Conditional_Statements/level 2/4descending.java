import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    
    long arr[] = {a,b,c,d};
    Arrays.sort(arr);
    long max = arr[3];
    long min1 = arr[0];
    long min2 = arr[1];
    long mid = arr[2];
    
    System.out.printf("%d > %d > %d > %d", max,mid,min2,min1);
  }
}
