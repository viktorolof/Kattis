import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int total_e = str.length() - 2;

        char first = str.charAt(0);
        String response = String.valueOf(first);
        for(int i = 0 ; i < total_e * 2 ; i++) {
            response = response + "e";
        }
        char last = str.charAt(str.length() -1);
        response = response + String.valueOf(last);


        System.out.println(response);
    }
}
