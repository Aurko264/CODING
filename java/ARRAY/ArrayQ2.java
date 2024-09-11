// Take an array of names as input from the user and print them on the screen.

import java.util.*;

public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Array size : ");
        int size = s.nextInt();
        String names[] = new String[size];

        //Input
        for (int i = 0; i < size; i++) {
        System.out.print("Enter the name : ");
            names [i]= s.next();
        }

        //Output
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " +(i+1) + " is : " + names[i]);
        }

            s.close();

    }
}
