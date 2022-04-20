import java.util.Scanner;
import java.lang.*;

public class filip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int reversed1 = 0;
        int reversed2 = 0;

        while(num1 != 0) {

            int digit = num1 % 10;
            reversed1 = reversed1 * 10 + digit;
            num1 /= 10;
        }

        while(num2 != 0) {

            int digit = num2 % 10;
            reversed2 = reversed2 * 10 + digit;
            num2 /= 10;
        }
        System.out.println(Math.max(reversed1, reversed2));
    }
}
