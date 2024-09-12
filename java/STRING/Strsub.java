// Substring

public class Strsub {
    public static void main(String[] args) {
        String sentence = "My name is Tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}
/* 
 * public static void main(String[] args) {
        String sentence = "TonyStark";
        String name = sentence.substring(4);[BY DEFAULT IT WILL TAKE LAST INDEX AS ENDING INDEX]
        System.out.println(name);
    }

    OUTPUT
    >>>>Stark<<<<<
*/