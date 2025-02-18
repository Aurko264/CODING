// WAP a program to find armstrong number between two numbers.

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter the 2 numbers : ");
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        int num ;
        for(int i = a ; i <= b; i++){
            num = i;
            int sum = 0;
            while(num > 0){
                int rem = num % 10;
                sum += rem * rem * rem;
                num = num / 10;
            }           
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}

