//Print the pattern

                 /*

                      11111
                      222
                      33
                      4
                      

                             */


public class Adpattern6 {
    public static void main(String[] args){
        int n = 4;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(i);
            }
             
              //Another way
            /*for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }*/

                //OUTPUT
                /*4444
                  333
                  22
                  1*/              

            System.out.println();
        }
    }
}
