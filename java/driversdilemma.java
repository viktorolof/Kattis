import java.util.Scanner;

public class driversdilemma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double C = scan.nextDouble() / 2; //gallons in tank
        double X = scan.nextDouble(); //gasleak (formatera om)?
        double M = scan.nextDouble(); // miles to gas station

        double[][] speed_mpg = new double[6][2];
        for (int i = 0 ; i < 6 ; i++) {
            for (int k = 0 ; k < 2 ; k++) {
                speed_mpg[i][k] = scan.nextDouble();
            }
        }

        boolean res = false;
        for (int i = 5 ; i >= 0 ; i--) {

            double mpg = speed_mpg[i][1];
            double mph = speed_mpg[i][0];


            double G = mph / mpg; // gallons/h
            double K = X + G; // Total fuel loss / h


            double result = C - ((M / mph) * K);

            if(result > 0) {
                System.out.println("YES " + (int)mph);
                res = true;
                break;
            }
        }

        if(!res) {
            System.out.println("NO");
        }

        scan.close();
    }
}
