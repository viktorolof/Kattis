import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String res = "";
        for(int i = 0 ; i < n ; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if(b - c > a) {
                res = res +"advertise";
            }
            else if(b - c < a) {
                res = res + "do not advertise";
            }
            else{
                res = res + "does not matter";
            }

            res = res + '\n';
        }

        System.out.println(res);
    }
}
