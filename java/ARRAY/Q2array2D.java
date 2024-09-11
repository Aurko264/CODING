// Print the spiral order matrix as output for a given matrix of numbers.

import java.util.*;

public class Q2array2D{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = s.nextInt();
        System.out.print("Enter the columns : ");
        int m = s.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("Enter the matrix : ");

        //Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("The spiral order of matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        // To print spiral order matrix

        while (rowStart <= rowEnd && colStart <= colEnd) {
            
            //1
            for (int col = colStart;  col <= colEnd;  col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }

            rowStart++;        

            //2
            for (int row = rowStart;  row <= rowEnd;  row++) {
                System.out.print(matrix[row][colEnd] + " " );
            }

            colEnd--;

            //3
            for (int col = colEnd; col >=colStart ; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }

            rowEnd--;

            //4
            for (int row = rowEnd; row >=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }

            colStart++;

            System.out.println( );
            
            s.close();

        }
        
    }
}
