Ryan McPartlan
Java
5/5/2016


public class BankAndSavings {
    public static void main(String[] args)
    {           
       // Create a SavingsAccount object with a $100 balance.
       SavingsAccount savings = new SavingsAccount(100.0);


       // Display what we've got.
       System.out.println("Initial");
       System.out.println("Balance: $" + savings.getBalance());
       System.out.println("Number of deposits: " + savings.getNumDeposits());
       System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
       System.out.println();


       // Make a withdrawal.
       savings.withdraw(200.00);


       // Display what we've done so far.
       System.out.println("After withdrawing $200");
       System.out.println("Balance: $" + savings.getBalance());
       System.out.println("Number of deposits: " + savings.getNumDeposits());
       System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
       System.out.println();    


       // Make a withdrawal.
       savings.withdraw(50.00);


       // Display what we've done so far.
       System.out.println("After withdrawing $50");
       System.out.println("Balance: $" + savings.getBalance());
       System.out.println("Number of deposits: " + savings.getNumDeposits());
       System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
       System.out.println();   


       // Make a deposit.
       savings.deposit(450.00);
       
       //Display
       System.out.println("After depositing $450");
       System.out.println("Balance: $" + savings.getBalance());
       System.out.println("Number of deposits: " + savings.getNumDeposits());
       System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
       System.out.println();
   }
}


abstract class BankAccount{
    private double balance;
    private int numDeposits;
    private int numWithdrawals;
    
    BankAccount(double balance){
        this.balance = balance;
        numDeposits = 0;
        numWithdrawals = 0;
    }
    
    void deposit(double amount){
        balance += amount;
        numDeposits++;
    }
    
    void withdraw(double amount){
        balance -= amount;
        numWithdrawals++;
    }
    
    double getBalance(){
        return balance;
    }
    
    int getNumDeposits(){
        return numDeposits;
    }
    
    int getNumWithdrawals(){
        return numWithdrawals;
    }
}


class SavingsAccount extends BankAccount{
    
    SavingsAccount(double balance){
        super(balance);
    }
    
    @Override
    public void deposit(double amount){
        if(amount > 0){
            super.deposit(amount);
        }
    }
    
    @Override
    public void withdraw(double amount){
        if(amount > super.getBalance()){
        } else if (amount > 0){
            super.withdraw(amount);
        }
    }
}
