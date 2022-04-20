import java.util.Scanner;

public class abracadabra {
    public static void main(String[] args) {
        String a = " abracadabra";
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        for (int i = 0; i < x; i++) {

            System.out.println(i + 1 + a);        }
    }
}