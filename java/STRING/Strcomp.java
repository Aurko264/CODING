//Compare string

public class Strcomp {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";

        // Will give either of the following values when compared. 
        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value

        if (name1.compareTo(name2)== 0) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    } 
}
