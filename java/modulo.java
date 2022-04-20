import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class modulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> S = new HashSet<>();
         for(int i = 0 ; i < 10 ; i++) {
             int x = scan.nextInt();
             S.add(x % 42);

         }

        System.out.println(S.size());
    }
}
