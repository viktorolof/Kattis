import java.util.Scanner;

public class chanukah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int datasets = scan.nextInt();
        int[] arr = new int[10000];
        arr[0] = 2;

        for(int i = 0 ; i < datasets ; i++) {
            int dataset = scan.nextInt();
            int days = scan.nextInt();
            int candles = 0;
            // om vi redan räknat ut värdet, kan vi ta det direkt med följande if sats
            if(arr[days - 1] != 0) {
                candles += arr[days - 1];
            }
            else {
                int count = 0;
                // först kollar vi vilket det största värdet i arrayen vi kan "slippa" räkna igen är
                for(int k = days - 2 ; k >= 0 ; k--) {
                    if(arr[k] != 0) {
                        // lägg till det värdet och hoppa ur loopen
                        candles += arr[k];
                        count++;
                        break;
                    }
                    count++;
                }
                // från position days - count är det tomt i arrayen
                for(int j = 0 ; j < count ; j++) {
                    // värdet på position days - count + j räknas ut genom:
                    // antal tidigare candles + (dagar - count) + j + 2.
                    candles = candles + days - count + j + 2;
                    arr[days - count +j] = candles;
                }
            }

            System.out.println(dataset + " " + candles);
        }
    }
}
