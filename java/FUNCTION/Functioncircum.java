// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;

public class Functioncircum {
    public static int printcircumference(int r){
        int a = 2;
      double b = 3.14; 
       double n = a * b * r;    
       System.out.println(n);
       
       return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius = ");
        int r = s.nextInt();
      
        printcircumference(r);

        s.close();
    }
}
