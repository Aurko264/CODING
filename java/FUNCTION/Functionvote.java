// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;

public class Functionvote {
    public static void printEligibility(int a){
        if(a<18){
            System.out.print("You are not eligible to VOTE");
        }else{
            System.out.print("You are eligible to VOTE");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int a = s.nextInt();

        printEligibility(a);

        s.close();
    }
}
