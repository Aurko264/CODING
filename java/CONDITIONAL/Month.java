// Print the name of the month according tothe no given.

import java.util.*;


public class Month {
    public static void main(String[] args){
        Scanner s = new Scanner( System.in);
        System.out.print(" Enter the Month no ");
        int button = s.nextInt();

        switch(button){
            case 1 : System.out.println("JANUARY");
            break;
            case 2 : System.out.println("FEBUARY");
            break;
            case 3 : System.out.println("MARCH");
            break;
            case 4 : System.out.println("APRIL");
            break;
            case 5 : System.out.println("MAY");
            break;
            case 6 : System.out.println("JUNE");
            break;
            case 7 : System.out.println("JULY");
            break;
            case 8 : System.out.println("AUGUST");
            break;
            case 9 : System.out.println("SEPTEMBER");
            break;
            case 10 : System.out.println("OCTOBER");
            break;
            case 11 : System.out.println("NOVEMBER");
            break;
            case 12 : System.out.println("DECEMBER");
            break;
        }

        s.close();
    }
}