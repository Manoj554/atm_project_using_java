import java.util.ArrayList;

public class LoadData {
    static ArrayList<BankAccount> list = new ArrayList<>();

    public static void main(String[] args) {
        // Addresses
        Address addr1 = new Address("bbsr", "odisha", 751002);
        Address addr2 = new Address("chennai", "Tamilnadu", 731652);
        Address addr3 = new Address("mumbai", "Maharastra", 851402);
        Address addr4 = new Address("patna", "Bihar", 640022);

        // Customers
        Customer cust1 = new Customer("Manoj Mondal", 23, 'M', addr1);
        Customer cust2 = new Customer("Alzari Joseph", 21, 'M', addr2);
        Customer cust3 = new Customer("Kelvin shaw", 27, 'M', addr3);
        Customer cust4 = new Customer("Venus kali", 19, 'F', addr4);

        // Acccounts
        BankAccount b1 = new BankAccount(cust1, 12345);
        BankAccount b2 = new BankAccount(cust2, 23456);
        BankAccount b3 = new BankAccount(cust3, 34567);
        BankAccount b4 = new BankAccount(cust4, 45678);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        // System.out.println(list);
    }
}
