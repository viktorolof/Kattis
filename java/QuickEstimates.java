import java.util.Scanner;
import java.math.BigInteger;
public class QuickEstimates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String res = "";
        for(int i = 0 ; i < N ; i++) {
            BigInteger x = scan.nextBigInteger();
            BigInteger ten = new BigInteger("10");
            int y = 0;
            do {
                x = x.divide(ten);
                y++;
            }while(x.doubleValue() != 0);
            res = res + y +'\n';
        }

        System.out.println(res);
    }
}
