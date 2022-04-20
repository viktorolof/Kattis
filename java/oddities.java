import java.util.Scanner;

public class oddities {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String res = "";
        for (int i = 0 ; i < n ; i++) {
            int x = scan.nextInt();
            if(x % 2 == 0) {
                res = res + x + " is even\n";
            }
            else{
                res = res + x + " is odd\n";
            }
        }
        System.out.println(res);
    }
}
