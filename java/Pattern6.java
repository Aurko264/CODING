//Print the pattern
   /*

    1
    12
    123
    12345
    12

    */

 import java.util.*;   


public class Pattern6 {
    public static void main(String[] args){
        int n = 5;

        for(int i = 1;i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
