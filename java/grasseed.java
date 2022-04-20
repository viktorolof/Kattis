import java.util.Scanner;

public class grasseed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();
        int lawns = scan.nextInt();
        double total = 0;

        for(int i = 0 ; i < lawns ; i++) {
            total += scan.nextDouble() * scan.nextDouble();
        }
        System.out.println(total * price);
    }
}
