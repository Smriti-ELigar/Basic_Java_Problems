// Get a 2 input from a user, first one for count of step and 2nd one for direction(only right and left). Find the position after moving by left or right by the specified number of steps

import java.util.*;
class Sol{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long steps = sc.nextLong();
    char dir= sc.next().charAt(0);
    long x = 0;
    long y = 0;
    if(dir=='r'|| dir=='R'){
      x=steps;
    }
    else if(dir=='l'|| dir=='L'){
      x=-steps;
    }
    else{
      return;
    }
    System.out.printf("(%d,%d)%n",x,y);
  }
}
