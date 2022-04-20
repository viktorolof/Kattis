import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BasicProgramming1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int t = scan.nextInt();
        int[] A = new int[N];
        for(int i = 0 ; i < N ; i++) {
            A[i] = scan.nextInt();
        }

        switch(t) {
            case 1:
                System.out.println(7);
                break;

            case 2:
                if(A[0] > A[1]) {
                    System.out.println("Bigger");
                }
                else if(A[0] < A[1]) {
                    System.out.println("Smaller");
                }
                else {
                    System.out.println("Equal");
                }
                break;

            case 3:
                int[] a = new int[3];
                a[0] = A[0];
                a[1] = A[1];
                a[2] = A[2];
                Arrays.sort(a);
                System.out.println(a[1]);
                break;

            case 4:
                long result = 0;
                for(int i = 0 ; i < N ; i++) {
                    result += A[i];
                }
                System.out.println(result);
                break;

            case 5:
                long res = 0;
                for(int i = 0 ; i < N ; i++) {
                    if(A[i] % 2 == 0) {
                        res += A[i];
                    }
                }
                System.out.println(res);
                break;

            case 6:
                char[] C = new char[N];
                for(int i = 0 ; i < N ; i++) {
                    C[i] = (char) ((A[i] % 26) + 97);
                }
                System.out.println(String.valueOf(C));
                break;

            case 7:
                boolean cyclic = false;
                int i = 0;
                Set<Integer> M = new HashSet<>();
                while(cyclic == false) {
                    i = A[i];
                    if(i < 0 || i >= N) {
                        System.out.println("Out");
                        break;
                    }
                    else if(i == N - 1) {
                        System.out.println("Done");
                        break;
                    }
                    else {
                        if(M.contains(i)) {
                            cyclic = true;
                            System.out.println("Cyclic");
                            break;
                        }
                        else {
                            M.add(i);
                        }
                    }
                }
                break;

        }
    }
}
