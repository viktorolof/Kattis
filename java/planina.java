import java.util.Scanner;

public class planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        double res = Math.pow(2, n) + 1;
        res = res * res;
        int val = (int) res;

        System.out.println(val);
    }
}


