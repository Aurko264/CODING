//WAP to check whether a number is prime or not.

import java.util.*;

public class Prime {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no = ");
        int n = s.nextInt();

        boolean isprime = true;
        for(int i = 2;i <= n/2; i++){
            if(n % 2== 0){
                isprime = false;
            }break;
        }
        if(isprime){
            if(n==1){
                System.out.println("This is neither prime nor composite");
            }
            else{
                System.out.println("This is a prime number");
            }                                                                    
           } else{
                System.out.println("This is not a prime no");
            }

            s.close();
        }
    }

