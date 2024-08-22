import java.util.*;

public class Abcondition{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();

        if(a == b){
            System.out.println("a equal to b");
        }
        else{
            if(a > b){
                System.out.println("a is greater than b");
            }
            else{
                System.out.println("a is smaller than b");
            }
            s.close();
        }
    } 
}