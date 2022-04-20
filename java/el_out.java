import java.util.Scanner;

public class el_out {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        int[] output = new int[testcases];

        for(int i = 0 ; i < testcases ; i++) {
            int sladdar = scan.nextInt();
            int appliances = 0;

            for(int k = 1 ; k <= sladdar ; k++) {
                appliances += scan.nextInt();
            }

            appliances -= sladdar - 1;
            output[i] = appliances;
        }

        for(int i = 0 ; i < testcases ; i++) {
            System.out.println(output[i]);
        }
    }
}
