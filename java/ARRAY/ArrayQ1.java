// Take an array as input from user.Search for a given number x and print the index at which it occurs.

import java.util.*;

public class ArrayQ1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = s.nextInt();
        int numbers[] = new int[size];
        
        //Input
        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
        }

        System.out.print("Enter the no you want to look for : ");
        int x = s.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }

        s.close();
    }
}
