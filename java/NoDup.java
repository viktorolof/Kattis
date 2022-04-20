import java.util.ArrayList;
import java.util.Scanner;

public class NoDup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Scanner scan2 = new Scanner(input).useDelimiter("\\s* \\s*");

        ArrayList<String> arr = new ArrayList<>();

        while(scan2.hasNext()) {
            arr.add(scan2.next());
        }

        boolean containsDouble = false;
        for(int i = 0 ; i < arr.size() ; i++) {
            for(int j = 0 ; j < arr.size() ; j++) {
                if(i != j) {
                    if(arr.get(i).equals(arr.get(j))) {
                        containsDouble = true;
                    }
                }
            }
        }

        if(containsDouble) {
            System.out.println("no");
        }
        else {
            System.out.println("yes");
        }

    }
}
