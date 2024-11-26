// Insert a character at some index.

public class SBins {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(0, 'S');
        System.out.println(sb);
    }
}
