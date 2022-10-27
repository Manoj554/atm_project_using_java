
public class BankAccount extends Customer {
    int accountNumber;
    String password;
    int balance;

    BankAccount() {
        super();
    }

    BankAccount(Customer cust, int ac) {
        super(cust);
        this.accountNumber = ac;
        this.password = "password";
        this.balance = 0;
    }

    BankAccount(Customer cust, int ac, String password, int balance) {
        this(cust, ac);
        this.password = password;
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "[ BankAccount: { accountNo: " + accountNumber + ", balance: " + balance + " } ]";
    }
}
