package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.Stock;
import fr.epita.bank.datamodel.StockOrder;

public class Launcher {

    public static void main(String[] args) {
        Customer customer = new Customer("Thomas", "Paris");
        Stock tesla = new Stock(99,"Tesla" );
        StockOrder order = new StockOrder(tesla, 50, tesla.getPrice(),25);
        System.out.println(customer);
        System.out.println(tesla);
        System.out.println(order);

    }
}
