import java.util.*;


public class Marks {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int input;

        do{
            System.out.print("Enter the marks = ");
            int marks = s.nextInt();
            if (marks >= 90 && marks <= 100){
                System.out.println("This is good");
            }else if(marks >= 60 && marks <=89){
                System.out.println("This is also good");
            }else if(marks >= 0 && marks <= 59){
                System.out.println("This is good as well");
            }else{
                System.out.println("Invalid");
            }
            System.out.println("Want to continue ? (yes(1) or no(0))");
            input = s.nextInt();
        }while(input == 1);

        s.close();
    }
}
