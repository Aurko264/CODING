import java.util.*;


public class Functionsum {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("a =  ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();
    
         int sum = calculateSum(a, b);
         System.out.println("a + b = " + sum);
    }
}
