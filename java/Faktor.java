import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        double I = scan.nextDouble() - 0.99999999;
        double result = A * I;
        System.out.println((int) result +1);
    }
}
