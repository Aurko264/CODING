/*10.	Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.*/

import java.util.*;


public class Fibonacci {
    public static void main(String[] args) {
       int a = 0;
       int b = 1;
       int c;
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the count : ");
       int count = s.nextInt();

       
       System.out.print(a + " " + b);
       for(int i = 2; i<count; i++){
        c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
       }
       s.close();
    }
}

