//Print the pattern
         /*
 
          *        *
          **      **
          * *    * *
          *  *  *  *
          *   **   *
          *   **   *
          *  *  *  *
          * *    * *
          **      **
          *        *

                        */


public class Adpattern3 {
    public static void main(String[] args){
        int n = 5;

        //UPPER HALF
        for(int i = 1; i<=n; i++){
            
            //FIRST PART
            for(int j =1; j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

             //SPACES
             int spaces = 2*(n-i);
             for(int j =1; j<=spaces; j++){
                System.out.print(" ");
            }

            //SECOND PART            
            for(int j =1; j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //LOWER HALF
        for(int i = n; i>=1; i--){
                       
            //FIRST PART
            for(int j =1; j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

             //SPACES
             int spaces = 2*(n-i);
             for(int j =1; j<=spaces; j++){
                System.out.print(" ");
            }

            //SECOND PART            
            for(int j =1; j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
