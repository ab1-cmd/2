/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balance;

/**
 *
 * @author anilk
 */
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
