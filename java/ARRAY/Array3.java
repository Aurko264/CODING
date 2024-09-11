// Example 3

import java.util.*;

public class Array3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = s.nextInt();
        int numbers[] = new int[size];

        //Input
        for(int i=0; i<3; i++){
         numbers[i] = s.nextInt();
        }

        //output
        for(int i =0; i<3; i++){
            System.out.println(numbers[i]);
        }

        s.close(); 
    }
}
