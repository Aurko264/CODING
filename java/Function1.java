import java.util.*;

public class Function1 {
    public static void printMyName(String name){
        System.out.println("Hello " + name);
        return;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("what is your name - ");
        String name = s.next();

        printMyName(name);//call kiya function ko

        s.close();
    }
}
