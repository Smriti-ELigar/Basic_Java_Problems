import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long d = sc.nextLong();
    long m = sc.nextLong();
    long y = sc.nextLong();
    
    if(y<1900 || y>9999 || m<1 || m>12){
      System.out.println("Invalid");
      return;
    }
    
    int days = (m==2)? (y % 4==0 && (y % 100!= 0 || y % 400 == 0)? 29 : 28):
                (m==4||m==6||m==9||m==11)? 30 :31;
    System.out.println((d<1 || d>days) ? "Invalid" : "Valid");
    
  }
}
