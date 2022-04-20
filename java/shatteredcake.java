import java.util.Scanner;

public class shatteredcake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int N = scan.nextInt();
        int L = 0;

        for (int i = 0 ; i < N ; i++) {
            L += scan.nextInt() * scan.nextInt();
        }

        System.out.println(L / W);
    }
}
