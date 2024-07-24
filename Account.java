package balance;
import java.util.Scanner;

public class Account {
    int acc,bal;
    String name;
    
    public void read() throws Exception{
        Scanner s1 = new Scanner (System.in);
        System.out.println("enter name");
        name=s1.nextLine();
        System.out.println("enter account number");
        acc=s1.nextInt();
        System.out.println("enter account balance");
        bal=s1.nextInt();
        
    }
    public void display()throws Exception {
        System.out.println("ACCOUNT DETAILS");
        System.out.println("NAME:"+name);
        System.out.println("ACCOUNT NUMBER:"+acc);
        System.out.println("ACCOUNT BALANCE:"+bal);
        
    }
}
