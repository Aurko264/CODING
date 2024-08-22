//Make a function to check if a number is prime or not.


import java.util.*;


public class Functionprime {
   public static int printPrime(int n){  
      if(n % 2 == 0){
      System.out.println("Given no is not a prime no");
     }else{
      System.out.println("Given no is a prime no");
     }
        return 0;
   }
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no = ");
        int n = s.nextInt();

        printPrime(n);
    }

}
