import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number up to which you want the Fibonacci series: ");
        int max = scanner.nextInt();

        // Generate Fibonacci series
        System.out.println("Fibonacci series up to " + max + ":");
        generateFibonacci(max);

        scanner.close();
    }

    private static void generateFibonacci(int max) {
        int first = 0, second = 1;

        // Print Fibonacci numbers up to the given maximum value
        if (max >= first) {
            System.out.print(first + " ");
        }
        if (max >= second) {
            System.out.print(second + " ");
        }

        int next;
        while (true) {
            next = first + second;
            if (next > max) {
                break;
            }
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
