class Address {
    String address;
    String state;
    int pincode;

    Address() {
    }

    Address(String address, String state, int pincode) {
        this.address = address;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "[ Address: { " + address + ", state: " + state + ", Pin: " + pincode + " } ]";
    }
}

public class Customer {
    String customerName;
    int age;
    char sex;
    Address address;

    Customer() {
    }

    Customer(String name, int age, char sex, Address address) {
        this.customerName = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    Customer(Customer cust) {
        this.customerName = cust.customerName;
        this.age = cust.age;
        this.sex = cust.sex;
        this.address = cust.address;
    }

    @Override
    public String toString() {
        return "[ Customer: { Name: " + customerName + ", Age: " + age + ", Sex: " + sex + ", Address: " + address
                + " } ]";
    }
}
