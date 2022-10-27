import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoadData.main(null);
        Scanner sc = new Scanner(System.in);

        int choice = 0, acc = 0, usc = 0;
        System.out.println("Welcome To ATM !!!");

        ol: do {
            System.out.println("Press 0 to quit this program and any number to continue !!!");
            usc = sc.nextInt();

            if (usc == 0)
                break;

            System.out.print("Enter your account number:- ");
            acc = sc.nextInt();

            if (ATM.validate(acc)) {
                ATM obj = new ATM();
                int amount;

                do {
                    System.out.println(
                            "\nPress \n1.Check Balnce \n2.Deposite \n3.Withdraw \n4.Previous Menu \n5.Exit the Program");
                    System.out.print("Choose your option:- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            obj.checkBalance();
                            break;
                        case 2:
                            System.out.print("Enter the amount :- ");
                            amount = sc.nextInt();
                            obj.addMoney(amount);
                            break;
                        case 3:
                            System.out.print("Enter the amount :- ");
                            amount = sc.nextInt();
                            obj.withDraw(amount);
                            break;
                        case 4:
                            System.out.println("Thank you for using ATM !!!");
                            break;
                        case 5:
                            break ol;
                        case 6:
                            System.out.println("All Accounts");
                            for (BankAccount ba : LoadData.list)
                                System.out.println(ba);
                            break;

                        default:
                            break;
                    }
                } while (choice != 4);
            } else {
                System.out.println("Account not found !!!");
                System.out.println("TRY again later !!!");
            }
        } while (usc != 0);

        sc.close();
    }
}
