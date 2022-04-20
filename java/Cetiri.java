import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cetiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> input_numbers = new ArrayList<>(3);

        /*Read three numbers from input*/
        input_numbers.add(scanner.nextInt());
        input_numbers.add(scanner.nextInt());
        input_numbers.add(scanner.nextInt());

        /*Sort in increasing order*/
        Collections.sort(input_numbers);

        /*Calculate offsets*/
        int offset_1 = input_numbers.get(1) - input_numbers.get(0);
        int offset_2 = input_numbers.get(2) - input_numbers.get(1);

        /*The smallest offset is the actual offset*/
        int actual_offset = Math.min(offset_1, offset_2);

        /*Look for missing number in sequence with that offset*/
        /*In case all the numbers are the same we save one from the list first*/
        int ans = input_numbers.get(0);

        for(int i = 0; i < 3; i++){
            int number = input_numbers.get(i) + actual_offset;
            if(!input_numbers.contains(number)){
                ans = number;
                break; //Stop when the missing number is found
            }
        }

        System.out.println(ans);
    }
}
