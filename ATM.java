public class ATM {
    static BankAccount bAccount;

    ATM() {
    }

    public void checkBalance() {
        System.out.println("Balance is " + bAccount.getBalance());
    }

    public void addMoney(int amount) {
        bAccount.setBalance(amount);
        System.out.println("Balance is " + bAccount.getBalance());
    }

    public void withDraw(int amount) {
        bAccount.setBalance(amount * -1);
        System.out.println("Balance is " + bAccount.getBalance());
    }

    public static boolean validate(int acc) {
        for (BankAccount ba : LoadData.list) {
            if (ba.accountNumber == acc) {
                bAccount = ba;
                return true;
            }
        }
        return false;
    }
}
