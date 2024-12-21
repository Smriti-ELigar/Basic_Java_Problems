// Get three inputs in the format-integer, character, integer. The inputs are all separated by spaces. Perform the operation with the integer values based on the character(+,-,*,/). Display the calculated value as the output.
// Ex : 23 + 45
// o/p : 68

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        int ans = 0;
        switch(op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
        }
        System.out.println(ans);
    }
}
