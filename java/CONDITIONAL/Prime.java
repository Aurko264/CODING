// WAP to check whether the no is prime or not.

import java.util.*;

public class Prime {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the no : ");
       int n = s.nextInt();

       boolean isPrime = true;
       for(int i=2; i<=n/2; i++) {
           if(n % i == 0) {
               isPrime = false;
               break;
           }
       }

       if(isPrime) {
           if(n == 1) {
               System.out.println("This is neither prime not composite");
           } else {
               System.out.println("This is a prime number");
           }
       } else {
           System.out.println("This is not a prime number");
       }

       s.close();
   }   
}