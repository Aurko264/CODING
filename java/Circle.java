import java.util.*;


public class Circle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Area of circle");
        System.out.println("Area = pi*r*r");
        double pi = 3.14;
        System.out.println("Enter Radius");
        double r = s.nextDouble();
        double area = pi*r*r;
        System.out.println(area); 

        s.close();
    }

}
