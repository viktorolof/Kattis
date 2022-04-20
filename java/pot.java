import java.util.Scanner;
import java.lang.Math;

public class pot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int result = 0;

        for(int i = 0 ; i < numbers ; i++){
            int x = scan.nextInt();
            int last_digit = x % 10;
            x = x / 10;
            double X = Double.valueOf(x);
            double ld = Double.valueOf(last_digit);
            double res = Math.pow(x,ld);

            result += res;
        }

        System.out.println(result);
    }
}
