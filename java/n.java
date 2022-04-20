import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0 ; i < n ; i++) {
            int x = scan.nextInt();
            int fact = 1;
            for(int k = 1 ; k <= x ; k++) {
                fact = fact * k;
            }
            System.out.println((fact % 10));
        }

    }
}
