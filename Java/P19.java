package bankaccountobject;
import java.util.Date;


public class BankAccountObject {
    public static void main(String[] args) {
        Account myAccount = new Account(1122, 20000);
        myAccount.setInterestRate(.045);
        myAccount.withdraw(2500);
        myAccount.deposit(3000);
        
        System.out.println("Balance: " + myAccount.getBalance() + "\nDate: " + myAccount.getDateCreated() + "\nInterest: " + myAccount.getMonthlyInterest());
    }
}


    class Account{
        private int id;
        private double balance;
        private double interestRate;
        private Date createdDate;


        public Account(){
            id = 00000;
            balance = 0.00;
            interestRate = 0;
            createdDate = new Date();
        }
        
        public Account(int newId, double newBalance){
            id = newId;
            balance = newBalance;
            interestRate = 0;
            createdDate = new Date();
        }
        
        public int getId(){
            return id;
        }
        
        public double getBalance(){
            return balance;
        }
        
        public double getInterestRate(){
            return interestRate;
        }
        
        public void setId(int newSetting){
            id = newSetting;
        }
        
        public void setBalance(double newSetting){
            balance = newSetting;
            
        }
        
        public void setInterestRate(double newSetting){
            interestRate = newSetting;
        }
        
        public Date getDateCreated(){
            return createdDate;
        }
        
        public  double getMonthlyInterestRate(){
            return interestRate / 12;
        }
        
        public double getMonthlyInterest(){
            return balance * getMonthlyInterestRate();
        }
        
        public void withdraw(double value){
            balance -= value;
        }
        
        public void deposit(double value){
            balance += value;
        }
    }




