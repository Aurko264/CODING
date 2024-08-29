//Write a programm to create a calculator. 

import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no");
        double x = s.nextDouble();
        double y = s.nextDouble();
        System.out.println("Enter + to add");
        System.out.println("Enter - to sub");
        System.out.println("Enter * to mul");
        System.out.println("Enter / to div");
        char operator = s.next().charAt(0);
        
        switch (operator) {
                case '+' : System.out.println( x + y);
                break;
                case '-' : System.out.println( x - y);
                break;
                case '*' : System.out.println( x * y);
                break;
                case '/' : System.out.println( x / y);
                break;
                default: System.out.println(" Invalid operator ");
                break;
        }

        s.close();
    }
}
