// Write a programm using function to calculate the factorial of a number

import java.util.*;


public class Factorialfunc {
 
    public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
 
 
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
 
 
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the factorial no = ");
        int n = s.nextInt();
 
 
        printFactorial(n);

        s.close();
    }
 }
 
 
 
 



 
