//Make a function to print the table of a given number n.


import java.util.*;

public class Functiontable {
    public static int printTable(int n){
        for(int i = 1; i<11; i++){
            int b = (n * i);
            System.out.println(b);
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no for table = ");
        int n = s.nextInt();

        printTable(n);

        s.close();
    }
}
