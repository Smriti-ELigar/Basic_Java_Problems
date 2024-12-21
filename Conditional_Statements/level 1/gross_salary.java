// 20000 : HRA = 30%, DA=95%"}'>Given basic Salary of an employee,calculate its gross salary according to the following condition:

// Basic Salary <= 10000 : HRA = 20%, DA=80%

// Basic Salary <= 20000 : HRA = 25%, DA=90%

// Basic Salary > 20000 : HRA = 30%, DA=95%
  
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();  //num is basic salary
        double ans;                   // ans is gross salary
        if (num <= 10000) {           // gross sal = bs + (bs*hra) + (bs*da)
            ans = num + (num * 0.2 + num * 0.8);
        } else if (num <= 20000) {
            ans = num + (num * 0.25) + (num * 0.9);
        } else {
            ans = num + (num * 0.3) + (num * 0.95);
        }

        System.out.printf("Rs.%.2f", ans);
    }
}
