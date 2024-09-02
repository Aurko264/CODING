// 	Write a function that calculates the Greatest Common Divisor of 2 numbers

import java.util.*;

public class FunctionGCd {
    public static void printGCD(int a , int b){
        int n = 0;
        for(int i=1; i<=a; i++){
            if (a % i == 0 && b % i == 0) {
                n = i;
            }
        }
        System.out.println("GCD value is : " + n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input A : ");
        int a = s.nextInt();
        System.out.print("Input B : ");
        int b = s.nextInt();

        printGCD(a, b);
        
        s.close();
    }
}
