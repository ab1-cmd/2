package balance;

public class BankBal {
    public static void main(String args[]){
        try{
            balance.Account a = new balance.Account();
            a.read();
            a.display();
        }
        catch(Exception e){
            System.out.println(e);
        }
}
}
