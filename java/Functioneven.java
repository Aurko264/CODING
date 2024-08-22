//Make a function to check if a given number n is even or not.


import java.util.*;


public class Functioneven {
   public static int printeven(int n){  
      if(n % 2 == 0){
      System.out.println("It is a even no");
     }else{
      System.out.println("It is not a even no");
     }
        return 0;
   }
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no = ");
        int n = s.nextInt();

        printeven(n);

        s.close();
    }

}

