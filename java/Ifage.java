// Write a programm to print adult or minor if age is more than 18 or below 18. 

import java.util.*;


public class Ifage {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("What is your age ?");
        int age = s.nextInt();
        System.out.print("You are an ");

        if(age > 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Minor");
        }
        if(age > 18){
            System.out.println("KEEP GRINDING");
        }
        else{
            System.out.println("SLEEP TIGHT");
        }

        s.close();
    }
}
