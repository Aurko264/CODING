// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class Functiongreater {
    public static void printGreater(int a, int b){
        if(a<b){
            System.out.print(b + " is greater ");
        }else if(a==b){
            System.out.print(" equal");
        }else{
            System.out.println(a + " is greater");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = s.nextInt();
        System.out.print("Enter b = ");
        int b = s.nextInt();

        printGreater(a, b);

        s.close();
    }
}
