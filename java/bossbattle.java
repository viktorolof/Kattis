import java.util.Scanner;

public class bossbattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 4) {
            System.out.println(1);
        }
        else {
            System.out.println(n - 2);
        }
    }
}
