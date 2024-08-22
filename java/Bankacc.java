
import java.util.*;
class Bankacc
{
    String name;
    long accNo;
    double balance;
    public void create()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name");
        name=s.nextLine();
        System.out.println("Enter account no");
        accNo=s.nextLong();
        balance=1000; 
        
        s.close();
    }
    public void deposite()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount to deposite");
        double a=s.nextDouble();
        balance=balance+a;

        s.close();
    }
    public void withdraw()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter withdraw amount");
        double w=s.nextDouble();
        if ((balance-w)>=1000)
        balance=balance-w;
        else
        System.out.println("Insufficient balance");

        s.close();
    }
    public void display()
    {
        System.out.println("name"+name+"\n"+"balance"+balance);
    }
        public static void main(String[]args)
    {
        Bankacc obj=new Bankacc();
        obj.create();
        obj.deposite();
        obj.display();
        obj.withdraw();
        obj.display();
    }

}