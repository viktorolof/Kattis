import java.util.Scanner;

import static java.lang.Math.*;

public class dicecup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        String res = "";
        boolean j = false;
        if(N == M) {
            System.out.println(N + 1);

        }
        else {
            j = true;
            for(int i = 0 ; i < abs(N - M) ; i++) {
                res = res + (i + min(N, M) + 1) + "\n";
            }
        }

        res = res + (max(N, M) + 1);
        if(j) {
            System.out.println(res);
        }

    }
}
