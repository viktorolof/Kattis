import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for(int i = 0; i < testCases ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(testAll(a, b, c)){
                System.out.println("Possible");
            }
            else {
                System.out.println("Impossible");
            }
        }
    }

    private static boolean testAll (int a, int b, int c) {
        if(a + b == c) {
            return true;
        }
        else if(a * b == c) {
            return true;
        }
        else if((float)a / (float) b == c) {
            return true;
        }
        else if(a - b == c) {
            return true;
        }
        else if((float)b / (float)a == c) {
            return true;
        }
        else if (b - a == c) {
            return true;
        }

        return false;
    }
}
