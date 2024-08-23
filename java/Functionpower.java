// 	Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.*;

public class Functionpower {
    public static void printPower(int x , int n){
        int result = 1;
        while(n!=0){
            result = result * x;
            n--;
        } 
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter X = ");
        int x = s.nextInt();
        System.out.print("Enter N = ");
        int n = s.nextInt();

        printPower(x, n);
        s.close();
    }
}
