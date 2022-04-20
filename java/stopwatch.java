import java.util.Scanner;

public class stopwatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int presses = scan.nextInt();
        if(presses % 2 == 1) {
            System.out.println("still running");
        }
        else {
            int result = 0;
            for(int i = 0 ; i < presses ; i += 2) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                result = result + (b - a);
            }
            System.out.println(result);
        }
    }
}
