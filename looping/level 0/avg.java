// Find the max,min,sum and average of the given n numbers without using array. 

// Note: -1 will be the termination of the input.
  
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
    long sum = 0;
    long count = 0;
    
    while(true){
      long n = sc.nextLong();
      if(n==-1) break;
      if(n<min) min = n;
      if(n>max) max = n;
      sum += n;
      count++;
    }
    if(count>0){
      double avg = (double)sum/count;
      System.out.println("Min = "+min);
      System.out.println("Max = "+max);
      System.out.println("Sum = "+sum);
      System.out.printf("Average = %.6f\n", avg);
    }
  }
}
