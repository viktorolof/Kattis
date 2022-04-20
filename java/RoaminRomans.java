import java.util.Scanner;

public class RoaminRomans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double miles = Double.parseDouble(input);
        System.out.println((int)Math.round(miles * (1000 * (5280.0 / 4854))));

    }
}
