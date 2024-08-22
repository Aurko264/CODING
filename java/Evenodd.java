import java.util.*;


public class Evenodd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no ! ");
        int x = s.nextInt();
        System.out.print("It is an ");

        if(x % 2 == 0){
            System.out.println("Even No");
        }
        else{
            System.out.println("Odd No");
        }

        s.close();
    }
}
