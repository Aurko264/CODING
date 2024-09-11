//Write a function to calculate the product of 2 numbers.
import java.util.*;


public class functionproduct {
    public static int calulateproduct(int a, int b){
         return a * b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = s.nextInt();
        System.out.print("Enter b = ");
        int b = s.nextInt();

        System.out.print("Product = ");
        System.out.print(calulateproduct(a, b));

        s.close();
    }
}
