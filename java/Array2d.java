// Input and Output in 2D array.

import java.util.*; 

public class Array2d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Rows : ");
        int rows = s.nextInt();
        System.out.print("Enter the columns : ");
        int columns = s.nextInt();

        int[][] numbers = new int[rows][columns];

        //Input

            //Rows
         for (int i = 0; i < rows; i++) {
            //Columns
          for (int j = 0; j < columns; j++) {
            numbers[i][j] = s.nextInt();  
            }
               
         }   

         //Output

            //Rows
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
            s.close();
    }
}
