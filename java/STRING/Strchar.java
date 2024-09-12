// String Character

public class Strchar {
    public static void main(String[] args) {
        String FirstName = "Tony";
        String LastName = "Stark";
        String fullName = FirstName + "@" + LastName;
    
        /*System.out.println(fullname.lenth());
         To print length of the string.*/
         
        System.out.println(fullName.length());
            
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
