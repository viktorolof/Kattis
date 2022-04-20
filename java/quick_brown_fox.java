import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class quick_brown_fox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int phrases = scan.nextInt();
        String bajs = scan.nextLine();
        String result = "";

        for(int i = 0 ; i < phrases ; i++) {
            String str = scan.nextLine();
            str = str.toLowerCase(Locale.ROOT);

            Set<Character> M = new HashSet<>();

            for(int n = 0 ; n < str.length() ; n++) {
                M.add(str.charAt(n));
            }

            String missing = "";

            for(int k = 'a' ; k <= 'z' ; k++) {
                if(!M.contains((char)k)) {
                    missing = missing + (char)k;
                }
            }

            if(missing.length() == 0) {
                result = result + "pangram\n";
            }
            else {
                result = result + "missing " + missing +"\n";
            }

        }

        System.out.println(result);

    }
}
