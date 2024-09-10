//For a given matrix of N x M, print its transpose.

import java.util.*;

public class Q3array2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = s.nextInt();
        System.out.print("Enter the columns : ");
        int m = s.nextInt();
        
        int matrix[][] = new int[n][m];

        System.out.println("Enter the matrix : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.nextInt(); 
            }
        }

        System.out.println("The transpose is : ");

        // To print transpose
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j]);
            }            
        }

        System.out.println();

        s.close();
    }
}
