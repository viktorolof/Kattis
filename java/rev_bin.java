import java.util.Scanner;
import java.lang.Math;
import java.lang.*;
import java.io.*;
import java.util.*;

public class rev_bin {
    public static void main(String[] args) {
        // läs in tal10
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        // gör om tal till bin sträng
        String s = Integer.toBinaryString(x);
        char[] temparray = s.toCharArray();
        // reverse sträng
        for(int i = 0 ; i < s.length() / 2 ; i++) {
            char temp = temparray[i];
            temparray[i] = temparray[s.length() - i - 1];
            temparray[s.length() - i - 1] = temp;
        }
        // gör tillbaka till vanligt tal
        String str = new String(temparray);
        x = Integer.parseInt(str, 2);
        // print tal
        System.out.println(x);
    }
}
