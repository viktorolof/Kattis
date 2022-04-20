import java.util.Scanner;

public class RatingProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 0;

        for (int i = 0 ; i < k ; i++) {
            result = result + scanner.nextInt();
        }

        float minResult = (float) ((k - n) * -3 + result) / n;
        float maxResult = (float) ((k - n) * 3 + result) / n;

        System.out.println(maxResult + " " + minResult);
    }
}
