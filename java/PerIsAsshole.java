import java.util.Scanner;

public class PerIsAsshole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        int lettersInCorrectPos = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(i % 3 == 0) {
                if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                    lettersInCorrectPos++;
                }
            }
            else if(i % 3 == 1) {
                if(s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                    lettersInCorrectPos++;
                }
            }
            else {
                if(s.charAt(i) == 'r' || s.charAt(i) == 'R') {
                    lettersInCorrectPos++;
                }
            }
        }

        System.out.println(s.length() - lettersInCorrectPos);
    }
}
