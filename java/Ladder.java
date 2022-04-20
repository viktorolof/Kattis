import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int v = scanner.nextInt();
        double vRad = v * (Math.PI / 180);

        double result = h / Math.sin(vRad);

        System.out.println((int)Math.ceil(result));



    }
}
