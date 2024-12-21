 // Check whether the given character is a Vowel or Consonant

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
            letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
