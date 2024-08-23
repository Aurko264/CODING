// 	Write a function that calculates the Greatest Common Divisor of 2 numbers

import java.util.*;

public class FunctionGCd {
    public static void printGCD(int a , int b){

        while(a != b){             
            if(a>b) {
                a = a - b;
            } else {
                b = b - a;
            }
            while(a == 0|| b == 0){
                System.out.println(a);
            }
    }

    //System.out.println(x);
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
