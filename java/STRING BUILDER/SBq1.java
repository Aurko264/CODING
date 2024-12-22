// Take an array of strings input from the user & find the cumulative(combined) length of all those strings.
 
import java.util.*;

public class SBq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder builders[] = new StringBuilder[size];

        for(int i = 0; i < size; i++){
           builders[i] = new StringBuilder(sc.nextLine());
        }
        System.out.println(builders.length);
    }
}