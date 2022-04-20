import java.util.Scanner;
import java.lang.Character;

public class SoftPasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String input = scanner.nextLine();
        int flag = 0;

        if(password.equals(input)){
            flag = 1;
        }

        /*Reverse cases of input and check against password*/
        String reverseInput = new String();
        for(int i = 0; i < input.length(); i++){
            Character c = input.charAt(i);
            if(Character.isUpperCase(c)){
                reverseInput += (Character.toLowerCase(c));
            }else{
                reverseInput += (Character.toUpperCase(c));
            }

        }


        if(reverseInput.equals(password)){
            flag = 1;
        }

        if(Character.isDigit(password.charAt(0))){
            if(password.substring(1).equals(input)){
                flag = 1;
            }
        }else if(Character.isDigit(password.charAt(password.length() - 1))) {
            if(password.substring(0, password.length() - 1).equals(input)){
                flag = 1;
            }
        }

       if (flag == 1) {
           System.out.println("Yes");
       }
       else {
           System.out.println("No");
       }
    }
}
