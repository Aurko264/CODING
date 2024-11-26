// How to set and get an character from a string.

public class SBchar{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        
        // Get a character from Index
        System.out.println(sb.charAt(0));

        // Set a character at Index
        sb.setCharAt(0, 'p');
        System.out.println(sb);
    }
}