import java.rmi.activation.ActivationGroupDesc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Marko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> t9 = new HashMap<>();
        t9.put(1, "");
        t9.put(2, "abc");
        t9.put(3, "def");
        t9.put(4, "ghi");
        t9.put(5, "jkl");
        t9.put(6, "mno");
        t9.put(7, "pqrs");
        t9.put(8, "tuv");
        t9.put(9, "wxyz");

        int words = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> dictionary = new ArrayList<>();
         for(int i = 0 ; i < words ; i++) {
            dictionary.add(scanner.nextLine());
         }
        String commands = scanner.nextLine();
        int result = 0;

        for (String s: dictionary) {
            Boolean success = true;
            if(s.length() == commands.length()) {
                for(int i = 0 ; i < commands.length() ; i++) {
                    String t9String = t9.get(Character.getNumericValue(commands.charAt(i)));
                    String charToBeChecked = String.valueOf(s.charAt(i));
                    if(!(t9String.contains(charToBeChecked))) {
                        success = false;
                    }
                }
            }
            else {
                success = false;
            }


            if(success) {
                result++;
            }
        }

        System.out.println(result);

    }
}
