package bank;

public class BankAccount {
    private String accountNumber; // Закрытое поле для номера счета
    private int cvv;
    private double balance;

    public BankAccount(String accountNumber, int cvv, double balance) {
        this.accountNumber = accountNumber;
        this.cvv = cvv;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Метод для снятия денег со счета
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void transferMoney(BankAccount bankAccount, int cvv, double amount) {
        if(cvv == this.cvv && amount <= this.balance){
            bankAccount.deposit(amount);
            this.balance -= amount;
        }else {
            System.out.println("Cvv is incorrect, access denied!!! or amount is incorrect");
        }

    }

    public int getCvv(){
        return cvv;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
