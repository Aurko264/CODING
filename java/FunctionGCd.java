// 	Write a function that calculates the Greatest Common Divisor of 2 numbers

import java.util.*;

public class FunctionGCd {
    public static void printGCD(int a , int b){

        while(a != b){  
            while(a % b == 0|| b % a == 0){         
                if(a>b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
           }
       }
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
