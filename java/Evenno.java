import java.util.*;

public class Evenno {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no = ");
        int n = s.nextInt();

        for(int i=1; i<=n; i++){
            if(i % 2 == 0){

                System.out.println(i);

            }
        }
    }
}
