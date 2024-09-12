// Write a program using switch. 

import java.util.*;


public class Condition {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to print Hello");
        System.out.println("Enter 2 to print Namaste");
        System.out.println("Enter 3 to print Bonjur");
        int button = s.nextInt();

        switch(button) {
            case 1 : System.out.println("Hello ");
            break;
            case 2 : System.out.println("Namaste");
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid button");
        }

        s.close();
    }
}
