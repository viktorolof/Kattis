import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String aut = "" + name.charAt(0);
        for (int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i) == '-') {
                aut = aut + name.charAt(i + 1);
            }
        }

        System.out.println(aut);

    }
}
