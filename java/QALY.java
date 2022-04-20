import java.util.Scanner;

public class QALY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        double res = 0;
        for(int i = 0 ; i < loop ; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            res += a * b;
        }

        System.out.println(res);
    }
}
