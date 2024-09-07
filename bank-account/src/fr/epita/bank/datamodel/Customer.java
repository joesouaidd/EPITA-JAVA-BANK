package fr.epita.bank.datamodel;
//domainname + project name + feature

public class Customer {
    String name;
    String address;


    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    };

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Customer{" + "address= " + address +'\''+ '}';
    }
}
