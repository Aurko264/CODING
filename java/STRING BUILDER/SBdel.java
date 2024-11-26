// Delete character at some index.

public class SBdel {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);
    }
}
