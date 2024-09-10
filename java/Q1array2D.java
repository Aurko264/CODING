//Take a matrix as input from user. Search for a given number x and print the indices atb which it occurs.

import java.util.*;

public class Q1array2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = s.nextInt();
        System.out.print("Enter the columns : ");
        int columns = s.nextInt(); 

        int[][] numbers = new int[rows][columns]; 
        
        //Input 
            //Rows
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the number : ");
        int x = s.nextInt();

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location : ("+ i +" , "+ j +")");
                }
            }
        }
         s.close();
    }
}
