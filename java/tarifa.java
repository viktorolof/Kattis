import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();
        int result = X;

        for(int i = 0 ; i < N ; i++) {
            result = result + X - scan.nextInt();
        }

        System.out.println(result);
    }
}
