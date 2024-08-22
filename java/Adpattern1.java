// Print the pattern
  
     /*

           *             *  
           * *         * *
           * * *     * * *
           * * * * * * * *
           * * * * * * * *
           * * *     * * *
           * *         * *
           *             * 

      */


public class Adpattern1 {
    public static void main(String[] args){
        int n = 4;

        //UPPER CASE
        for(int i=1; i<=n; i++){
            //FIRST PART
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            //SPACES
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //SECOND PART
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        //LOWER CASE
        for(int i=n; i>=1; i--){
            //FIRST PART
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            //SPACES
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //SECOND PART
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
