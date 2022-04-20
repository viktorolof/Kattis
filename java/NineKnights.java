import java.util.HashMap;
import java.util.Scanner;

public class NineKnights {
    public static void main(String[] args) {
        int knights = 0;
        boolean valid = true;
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> board = new HashMap<>();
        for (int i = 0 ; i < 5 ; i++) {
            board.put(i, scanner.nextLine());
        }


        for (int i = 0 ; i < 5 ; i++) {
            String str = board.get(i);
            for(int j = 0 ; j < str.length() ; j++) {
                if(str.charAt(j) == 'k'){
                    knights++;
                    // kalla funktion för att kolla positioner
                    if(!checkPositions(board, str, i, j)) {
                        valid = false;

                    }
                }
            }
        }

        if(knights != 9) {
            valid = false;
        }

        if(valid) {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

    }

    private static boolean checkPositions (HashMap<Integer, String> board, String str, int indexOfStr, int indexOfKnight) {
        // det är 8 positioner i värsta fall som ska kollas, om det inte finns hästar på någon av dessa ska true returneras
        if(indexOfStr-2 >= 0) {
            String indMinus2 = board.get(indexOfStr - 2);
            if(!checkCharacters(indMinus2, indexOfKnight -1, indexOfKnight +1)) {
                return false;
            }
        }
        if(indexOfStr+2 <= 4) {
            String indPlus2 = board.get(indexOfStr + 2);
            if(!checkCharacters(indPlus2, indexOfKnight -1, indexOfKnight +1)) {
                return false;
            }
        }
        if(indexOfStr-1 >= 0) {
            String indMinus1 = board.get(indexOfStr - 1);
            if(!checkCharacters(indMinus1, indexOfKnight -2, indexOfKnight +2)) {
                return false;
            }
        }
        if(indexOfStr+1 <= 4) {
            String indPlus1 = board.get(indexOfStr + 1);
            if(!checkCharacters(indPlus1, indexOfKnight - 2, indexOfKnight + 2)) {
                return false;
            }
        }

        return true;
    }

    //returns true if there are no knights
    private static boolean checkCharacters(String str, int index1, int index2) {
        boolean jojo = true;
        if(index1 >= 0) {
            if(str.charAt(index1) == 'k') {
                jojo = false;
            }
        }
        if(index2 <= 4) {
            if(str.charAt(index2) == 'k') {
                jojo = false;
            }
        }
        return jojo;
    }


}
