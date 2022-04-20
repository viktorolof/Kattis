import java.util.Arrays;
import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] tot = {1, 1, 2, 2, 2, 8};
        for(int i = 0 ; i < tot.length ; i++) {
            tot[i] -= scan.nextInt();
        }
        String str = "";
        for(int i = 0 ; i < tot.length ; i++) {
            str = str + tot[i] + " ";
        }
        System.out.println(str);
    }
}
