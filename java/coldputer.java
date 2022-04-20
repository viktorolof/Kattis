import java.util.Scanner;

public class coldputer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int count = 0;

        for(int i = 0 ; i < days ; i++) {
            if(scan.nextInt() < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
