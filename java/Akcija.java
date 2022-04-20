import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Akcija {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPrices = scanner.nextInt();
        int totalPrice = 0;
        ArrayList<Integer> priceList = new ArrayList<>(numOfPrices);

        /*Store prices in list*/
        for(int i = 0; i < numOfPrices; i++){
            priceList.add(scanner.nextInt());
        }

        /*Sort list in decreasing order*/
        priceList.sort(Collections.reverseOrder());

        /*Sum up prices skipping every third price*/
        for(int i = 1; i <= priceList.size(); i++){
            if(!(i%3 == 0)){
                totalPrice += priceList.get(i - 1);
            }
        }

        System.out.println(totalPrice);
    }
}
