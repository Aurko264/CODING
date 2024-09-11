//Write a function to print the sum of all odd numbers from 1 to n.

 import java.util.*;
public class Functionodd { 
    public static void printSum(int a){
        int sum = 0;

        for(int i= 1; i<=a; i++){
            if(i % 2 != 0){
            sum = sum + i;
            }
        }

        System.out.println(sum); 
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no = ");
        int a = s.nextInt();

        printSum(a);

        s.close();
    }    
}
