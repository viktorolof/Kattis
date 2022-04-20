import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class CD {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = scanner.readLine();
        String[] parts = firstLine.split(" ");
        int firstM = Integer.parseInt(parts[0]);
        int firstN = Integer.parseInt(parts[1]);




        while(firstM != 0 && firstN != 0) {
            long startTime = System.currentTimeMillis();
            int duplicates = 0;
            HashSet<String> list = new HashSet<>(1000000, (float)1);

            if(firstM > 0) {
                for(int i = 0 ; i < firstM ; i++) {
                    String x = scanner.readLine();
                    list.add(x);
                }
            }

            if(firstN > 0) {
                for(int i = 0 ; i < firstN ; i++) {
                    String x = scanner.readLine();
                    if(list.contains(x)) {
                        duplicates++;
                    }
                }
            }


            System.out.println(duplicates);
            /*
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println("Tid för en loop: " + elapsedTime);
            */
            firstLine = scanner.readLine();
            parts = firstLine.split(" ");
            firstM = Integer.parseInt(parts[0]);
            firstN = Integer.parseInt(parts[1]);

        }

    }
}
