//Find the maximum & minimum number in an array of integers.

import java.util.*;

public class ArrayQ3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = s.nextInt();
        int number[] = new int[size];

        System.out.print("Enter the numbers : ");

        //Input
        for (int i = 0; i < size; i++) {
            number[i] = s.nextInt();
        }

        //Storing minimun and maximum value
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        //Output
        for (int i = 0; i < number.length; i++) {
            if(number[i]<min){
                min = number[i];
            }

            if (number[i]>max) {
                max = number[i];
            }
        }

        System.out.println("The largest no is : " + max);
        System.out.println("The smallest no is : " + min);

        s.close();
    }
}
