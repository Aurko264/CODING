// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class Q1str {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = s.nextInt();

        System.out.println("Enter the string : ");
        String array[] = new String[size];
        int totLength = 0;

        for (int i = 0; i < size; i++) {
            array [i] = s.next();

            totLength += array[i].length();
        }

        System.out.println(totLength);
        s.close();
    }
}
