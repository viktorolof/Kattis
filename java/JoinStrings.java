import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//Time limit exceeded för fjärde testet på kattis, tror för BufferedReader är för långsam?
// men kanske kan lösas på nåt sjukt sätt dunno

public class JoinStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strings = bufferedReader.readLine();
        int amountOfStrings = Integer.parseInt(strings);
        String[] arrOfStrings = new String[amountOfStrings];
        for (int i = 0 ; i < amountOfStrings ; i++) {
            arrOfStrings[i] = bufferedReader.readLine();
        }


        int indexToBePrinted = 0;
        for(int i = 0 ; i < amountOfStrings -1 ; i++) {
            String[] numbers = getStrings(bufferedReader);
            int a = Integer.parseInt(numbers[0]) -1;
            int b = Integer.parseInt(numbers[1]) -1;
            indexToBePrinted = concatStrings(arrOfStrings, a, b);
        }

        System.out.println(arrOfStrings[indexToBePrinted]);

    }

    private static int concatStrings(String[] str, int a, int b) {
        str[a] += str[b];
        str[b] = "";
        return a;
    }

    private static String[] getStrings(BufferedReader bufferedReader) throws IOException {
        String operations  = bufferedReader.readLine();
        return operations.split(" ");
    }

}
