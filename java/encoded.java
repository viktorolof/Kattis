import java.util.Scanner;

public class encoded {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0 ; i < n ; i++) {
            String encoded = scan.nextLine();
            String decoded = "";
            double x = Math.sqrt(encoded.length());

            System.out.println(x);
            for(int k = 0 ; k < encoded.length() ; k++) {
                decoded = decoded + encoded.charAt((((int)x - 1) * (k+1)) % 25);
            }
            System.out.println(decoded);
        }

    }
}
