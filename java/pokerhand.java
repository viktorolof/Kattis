import java.util.ArrayList;
import java.util.Scanner;

public class pokerhand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<String>();
        char[] arr = new char[5];
       for(int i = 0 ; i < 5 ; i++) {
            data.add(scan.next());
            arr[i] = data.get(i).charAt(0);
       }

       int count  = 1;
       for (int i = 0 ; i < 5 ; i++) {
           int tempcount = 1;
           int first = arr[i];
           for (int k = i +1 ; k < 5 ; k++) {
               if(arr[k] == first) {
                   tempcount++;
               }
               if(tempcount > count) {
                   count = tempcount;
               }
           }
       }

       System.out.println(count);
    }
}
