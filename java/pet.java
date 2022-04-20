import java.util.Arrays;
import java.util.Scanner;


public class pet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res1 = scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt();
        int res2 = scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt();
        int res3 = scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt();
        int res4 = scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt();
        int res5 = scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt();

        int[] arr = {res1, res2, res3, res4, res5};
        int largest = arr[0];
        int index_of_largest = 0;
        for(int i = 1 ; i < 5 ; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
                index_of_largest = i;
            }

        }
        index_of_largest++;
        System.out.println(index_of_largest + " " + largest);
    }
}
