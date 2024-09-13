// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

import java.util.*;

public class Q3str {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the email id : ");
        String email = s.next();

        System.out.println("your user name is : ");
        String userName = "";

     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }

     System.out.println(userName);
     s.close();
   }
}

