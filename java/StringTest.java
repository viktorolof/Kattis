import java.util.Locale;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String[] strings = name.split("\\s+");
        String nameToMap = strings[strings.length -1].toLowerCase(Locale.ROOT);

        System.out.println(strings[strings.length -1]);
        System.out.println(nameToMap);
    }
}
