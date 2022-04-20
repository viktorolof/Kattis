import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++) {
            arr[i] =  scan.nextInt();
        }
        for(int i = 0 ; i < N ; i++) {
            System.out.println(arr[N - i -1]);
        }
    }
}
