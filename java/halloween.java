import java.util.Scanner;

public class halloween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.equals("OCT 31") || str.equals("DEC 25")) {
            System.out.println("yup");
        }
        else {
            System.out.println("nope");
        }
    }
}
