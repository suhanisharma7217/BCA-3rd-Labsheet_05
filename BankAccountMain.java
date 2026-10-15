public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Aarav Singh", 1000.0);
        account.deposit(500); account.withdraw(200); account.withdraw(5000); account.displayAccount();
    }
}
class BankAccount {
    private String accountNo, accountHolderName; private double balance;
    BankAccount(String accountNo, String accountHolderName, double balance) { this.accountNo=accountNo; this.accountHolderName=accountHolderName; this.balance=balance; }
    public void deposit(double amount){if(amount>0)balance+=amount;else System.out.println("Invalid deposit amount");}
    public void withdraw(double amount){boolean success=false; if(amount>0 && amount<=balance){balance-=amount;success=true;} if(success)System.out.println("Withdrawal successful");else System.out.println("Withdrawal failed");}
    public double getBalance(){return balance;}
    public void displayAccount(){System.out.println("Account: "+accountNo+", Holder: "+accountHolderName+", Balance: Rs."+getBalance());}
}
