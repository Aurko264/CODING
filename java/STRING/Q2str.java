// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.*;

public class Q2str {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");        
        String str = s.next();
        String result = " ";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
        s.close();
    }
}
