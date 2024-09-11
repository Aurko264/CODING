//Print the pattern

          /*

                   *****
                  *   *
                 *   *
                *   *
               *****

                          */                         


public class Adpattern4 {
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=n; i++){
            //SPACES
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //STARS
            for(int j=1; j<=n; j++){
                if(j == 1 || i == 1 || j == n || i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    } 
}
