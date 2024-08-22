//Enter 3 numbers from the user & make a function to print their average.

import java.util.*; 


public class Functionaverage {
    public static float calculateAverage(float a, float b, float c){
        float avg = a + b + c / 3;
        return avg;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Int a = ");
        float a = s.nextFloat();
        System.out.print("Int b = ");
        float b = s.nextFloat();
        System.out.print("Int c = ");
        float c = s.nextFloat();

        float avg = calculateAverage(a, b, c);
        System.out.print("Average of a, b, c is " + avg); 

        s.close();
    }
}
