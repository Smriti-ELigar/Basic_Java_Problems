// Find whether the given number is power of 2 or not.

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    sc.close();
    
    boolean flag = true;
    
    if(a<=0) flag = false;
    
    while(a>1){
        if(a%2 !=0){
          flag = false;
          break;
        }
      a/=2; // until 1
    }
    if(flag) System.out.println("YES");
    else System.out.println("NO");
    
  }
}
