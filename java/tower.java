import java.util.Scanner;

public class tower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bricks = scan.nextInt();
        int towers = 0;
        int last_brick = 0;


        for(int i = 1 ; i <= bricks ; i++) {
            int current_brick = scan.nextInt();

            if (current_brick > last_brick) {
                towers++;
                last_brick = current_brick;
            }
            else {
                last_brick = current_brick;
            }
        }

        System.out.println(towers);
    }
}
