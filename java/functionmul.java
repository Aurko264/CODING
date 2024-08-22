import java.util.*;


public class functionmul{
    public static int calculateMul(int a, int b){
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt(); 

        int mul = calculateMul(a, b);
        System.out.println("a * b = " + mul);

        s.close();
     }
}
