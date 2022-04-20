import java.util.Scanner;

public class hissingmic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.contains("ss")) {
            System.out.println("hiss");
        }
        else {
            System.out.println("no hiss");
        }
    }
}
