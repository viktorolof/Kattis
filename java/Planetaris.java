import java.util.Arrays;
import java.util.Scanner;

public class Planetaris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int solarsystem = scan.nextInt();
        int ships = scan.nextInt();
        int[] fin = new int[solarsystem];

        for(int i = 0 ; i < solarsystem ; i++) {
            fin[i] = scan.nextInt();
        }

        Arrays.sort(fin);


        int i = 0;
        boolean jojo = false;

        while(ships > 0) {
            if(i >= fin.length) {
                jojo = true;
                break;
            }
            ships -= (fin[i] + 1);
            if(ships >= 0) {
                i++;
            }
        }

        if(jojo) {
            System.out.println(solarsystem);
        }
        else {
            System.out.println(i);
        }

    }
}
